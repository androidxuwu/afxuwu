package com.example.haibeiapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haibeiapp.R;
import com.example.haibeiapp.bean.Home;
import com.example.haibeiapp.utils.ImageLoader;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class HomeAdapter extends AbsBaseAdapter<Home.DataEntity.ProductsEntity> {
    public HomeAdapter(Context context, List<Home.DataEntity.ProductsEntity> data) {
        super(context, data);
    }
    private ViewHolder holder;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView ==null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.gridview_haibei,null);
            holder.thumbImage = (ImageView) convertView.findViewById(R.id.imageView);
            holder.nameTv = (TextView) convertView.findViewById(R.id.tv_home_name);
            holder.priceTv = (TextView) convertView.findViewById(R.id.tv_home_price);
            holder.discountTv = (TextView) convertView.findViewById(R.id.tv_home_discount);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.nameTv.setText(getData().get(position).getName());

        String thumb = getData().get(position).getImages().get(0).getThumb();
        holder.thumbImage.setImageResource(R.mipmap.seashell_328);
        holder.thumbImage.setTag(thumb);
        ImageLoader.loadImage(context,thumb,holder.thumbImage);

        Home.DataEntity.ProductsEntity.Current_skuEntity.List_priceEntity list_price = getData().get(position).getCurrent_sku().getList_price();
        Home.DataEntity.ProductsEntity.Current_skuEntity.Real_priceEntity real_price = getData().get(position).getCurrent_sku().getReal_price();
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        String format = decimalFormat.format(real_price.getCNY()*10 / list_price.getCNY());
        String format1 = decimalFormat.format(real_price.getCNY() / 100);
        holder.discountTv.setText(String.valueOf(format)+"折");
        holder.priceTv.setText("￥"+String.valueOf(format1));
        return convertView;
    }
    class ViewHolder{
        ImageView thumbImage;
        TextView nameTv,priceTv,discountTv;
    }
}
