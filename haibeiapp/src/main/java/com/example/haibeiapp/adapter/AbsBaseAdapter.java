package com.example.haibeiapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/5/11 0011.
 */
public abstract class AbsBaseAdapter<T> extends BaseAdapter {
    private List<T> data;
    protected Context context;
    protected LayoutInflater inflater;

    public AbsBaseAdapter( Context context,List<T> data) {
        this.data = data;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    public List<T> getData() {
        return data;
    }

    @Override
    public int getCount() {
        return data != null ? data.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return data != null ? data.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return data != null ? position:null;
    }

    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent);
}
