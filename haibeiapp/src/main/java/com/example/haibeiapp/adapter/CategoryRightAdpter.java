package com.example.haibeiapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haibeiapp.R;
import com.example.haibeiapp.bean.Category;
import com.example.haibeiapp.utils.ImageLoader;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25 0025.
 */
public class CategoryRightAdpter extends AbsBaseAdapter<Category.DataEntity.CategoriesEntity.SubEntity> {
    public CategoryRightAdpter(Context context, List<Category.DataEntity.CategoriesEntity.SubEntity> data) {
        super(context, data);
    }
    private ViewHolder holder;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_listview_category_right, null);
            holder.ivImage = (ImageView) convertView.findViewById(R.id.iv_category_listview_right);
            holder.tvTitle = (TextView) convertView.findViewById(R.id.tv_category_listview_right);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvTitle.setText(getData().get(position).getName());
        String url = getData().get(position).getIcon();
        holder.ivImage.setImageResource(R.mipmap.seashell_328);
        holder.ivImage.setTag(url);
        if(url!=null){
        ImageLoader.loadImage(context, url, holder.ivImage);
        }else {
            holder.ivImage.setImageResource(R.mipmap.product_sold_out);
        }

        return convertView;
    }
    public static class ViewHolder {
        ImageView ivImage;
        TextView tvTitle;
    }
}
