package com.example.haibeiapp.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import com.jakewharton.disklrucache.DiskLruCache;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2016/5/24 0024.
 */

/**
 * Created by yangjw on 2016/5/23.
 * url：androidxx.cn
 * desc：TODO
 */
public class DiskCacheTool {

    public static final int MAx_SIZE = 4 * 1024 * 1024;
    private static DiskLruCache diskCache;

    //初始化DiskLruCache
    public static void init(Context context) {
        //1、保存图片的路径
        //2、当前APP的版本号
        //3、存储中key和value之间的对比是1：1，还是1：n
        //4、分配最大的存储空间

        try {
            if (diskCache == null) {
                diskCache = DiskLruCache.open(getCacheDir(context), getVersionCode(context), 1, MAx_SIZE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeBitmapToDisk(String url, Bitmap bitmap) {
        String cacheKey = getCacheKey(url);
        try {
            DiskLruCache.Editor edit = diskCache.edit(cacheKey);
            if (edit != null) {
                OutputStream outputStream = edit.newOutputStream(0);
                boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                if (compress) {
                    edit.commit();
                } else {
                    edit.abort();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Bitmap readBitmapFromDisk(String url) {
        String cacheKey = getCacheKey(url);
        try {
            DiskLruCache.Snapshot snapshot = diskCache.get(cacheKey);
            if (snapshot != null) {
                InputStream inputStream = snapshot.getInputStream(0);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                return bitmap;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getCacheKey(String url) {
        //MD5进行编码
        try {
            //MD5加密的工具类
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            //将需要加密的文字放入Digest中
            messageDigest.update(url.getBytes());
            //获取加密后的密文
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                stringBuffer.append(Integer.toHexString(Math.abs(digest[i])));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return String.valueOf(url.hashCode());
    }


    private static int getVersionCode(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 0;

    }

    /**
     * 保存图片的路径
     * @param context
     * @return
     */
    private static File getCacheDir(Context context) {
        if ((Environment.MEDIA_MOUNTED).equals(Environment.getExternalStorageState())
                && !Environment.isExternalStorageRemovable()) {
            return context.getExternalCacheDir();
        }
        return context.getCacheDir();
    }

}
