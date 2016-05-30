package com.example.haibeiapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;


import android.widget.AdapterView;
import android.widget.ImageView;

import com.example.haibeiapp.R;
import com.example.haibeiapp.adapter.CategoryListAdapter;

import com.example.haibeiapp.bean.Home;

import com.example.haibeiapp.http.Http;
import com.example.haibeiapp.utils.HttpUtil;
import com.example.haibeiapp.utils.IRequestCallBack;
import com.example.haibeiapp.utils.ImageLoader;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import in.srain.cube.views.GridViewWithHeaderAndFooter;

public class ListDiscoverActivity extends AppCompatActivity {
    private GridViewWithHeaderAndFooter gridview;
    private List<Home.DataEntity.ProductsEntity> data;
    private CategoryListAdapter adapter;
    private ImageView ivListdiscoverImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_discover);
        String img = getIntent().getStringExtra("img");
        String path = getIntent().getStringExtra("path");
        gridview = (GridViewWithHeaderAndFooter) findViewById(R.id.gv_listdiscover);
        ivListdiscoverImg = new ImageView(this);
        AbsListView.LayoutParams params = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 400);
        ivListdiscoverImg.setLayoutParams(params);
        gridview.addHeaderView(ivListdiscoverImg);
        ImageLoader.loadImage(this,img,ivListdiscoverImg);
        data = new ArrayList<>();
        adapter = new CategoryListAdapter(this,data);
        gridview.setAdapter(adapter);

        HttpUtil.requestGet(path, new IRequestCallBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Home home = gson.fromJson(result, Home.class);
                data.addAll(home.getData().getProducts());
                adapter.notifyDataSetChanged();
            }
        });

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String id1 = Http.DETAILS_PATH + data.get(position).getCurrent_sku().getId();
                Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
                intent.putExtra("id",id1);
                startActivity(intent);
            }
        });

    }
}
