package com.example.haibeiapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haibeiapp.R;
import com.example.haibeiapp.bean.Discover;
import com.example.haibeiapp.utils.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/21 0021.
 */
public class DiscoverAdapter extends AbsBaseAdapter<Discover.DataEntity.TopicsEntity> {
    public DiscoverAdapter(Context context, List<Discover.DataEntity.TopicsEntity> data) {
        super(context, data);
    }


    private  ViewHolder holder;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.listview_discover, null);
            holder.ivImage = (ImageView) convertView.findViewById(R.id.iv_discover_img);
            holder.tvTitle = (TextView) convertView.findViewById(R.id.tv_discover_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvTitle.setText(getData().get(position).getTitle());
        String url = getData().get(position).getImage();
        holder.ivImage.setImageResource(R.mipmap.seashell_328);
        holder.ivImage.setTag(url);
        ImageLoader.loadImage(context, url, holder.ivImage);

        return convertView;
    }

   public static class ViewHolder {
        ImageView ivImage;
        TextView tvTitle;
    }
}
