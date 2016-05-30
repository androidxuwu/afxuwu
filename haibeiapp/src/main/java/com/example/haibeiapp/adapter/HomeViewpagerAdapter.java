package com.example.haibeiapp.adapter;


import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class HomeViewpagerAdapter extends PagerAdapter{
    private List<View> data;

    public HomeViewpagerAdapter(List<View> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data!=null?data.size():0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = data.get(position);
        container.addView(view);
        return data.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView(data.get(position));
    }
}
