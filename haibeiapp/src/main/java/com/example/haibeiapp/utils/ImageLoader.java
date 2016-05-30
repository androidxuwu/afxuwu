package com.example.haibeiapp.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.widget.ImageView;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yangjw on 2016/5/23.
 * url：androidxx.cn
 * desc：TODO
 */
public class ImageLoader {

    private static final String TAG = "androidxx";
    private static ExecutorService executorService;
    private static Handler mHandler = new Handler();

    static {
        if (executorService == null) {
            //创建一个单个的线程池
            executorService = Executors.newSingleThreadExecutor();
        }
    }


    public static void loadImage(final Context context,final String path,final ImageView imageView) {
        DiskCacheTool.init(context);

        //首先在内存中取
        Bitmap bitmap = MemoryCacheTool.readBitmapFromCache(path);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Bitmap bitmap1 = DiskCacheTool.readBitmapFromDisk(path);
            if (bitmap1 != null) {
                imageView.setImageBitmap(bitmap1);
                MemoryCacheTool.writeBitmapToCache(path,bitmap1);
            } else {
                //内存中没有就从网络上取
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        final Bitmap bitmap = getBitmapFromNetwork(path);

                        mHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                if (imageView.getTag().toString().equals(path)) {
                                    MemoryCacheTool.writeBitmapToCache(path,bitmap);
                                    imageView.setImageBitmap(bitmap);
                                }
                            }
                        });
                    }
                });
            }


        }
    }

    /**
     * 请求网络图片
     */
    private static Bitmap getBitmapFromNetwork(String address) {
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {
            URL url = new URL(address);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

                int len = 0;
                byte[] buffer = new byte[1024];

                while ((len = inputStream.read(buffer)) != -1) {
                    byteArrayOutputStream.write(buffer,0,len);
                    byteArrayOutputStream.flush();
                }

                byte[] byteArray = byteArrayOutputStream.toByteArray();

                BitmapFactory.Options options = new BitmapFactory.Options();
                //设置图片解码时，只获取图片的属性，不真正将图片加载到内存
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
//                Log.d(TAG, "getBitmapFromNetwork: " + bitmap);
                //获得图片的宽度和高度
                int outHeight = options.outHeight;
                int outWidth = options.outWidth;

                int max = Math.max(outHeight, outWidth);
                int ratio = max/500;  //计算出来的压缩比例
                ratio = ratio < 1 ? 1: ratio;
                options.inSampleSize = ratio;  //将图片压缩到只有原先的ratio分之一

                options.inJustDecodeBounds = false;
                Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                DiskCacheTool.writeBitmapToDisk(address,bitmap);

                return bitmap;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(inputStream);
            httpURLConnection.disconnect();
        }

        return null;
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
