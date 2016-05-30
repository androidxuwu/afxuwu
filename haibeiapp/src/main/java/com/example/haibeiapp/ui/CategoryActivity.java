package com.example.haibeiapp.ui;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.haibeiapp.R;
import com.example.haibeiapp.adapter.CategoryLeftAdpter;
import com.example.haibeiapp.adapter.CategoryRightAdpter;
import com.example.haibeiapp.bean.Category;
import com.example.haibeiapp.http.Http;
import com.example.haibeiapp.utils.HttpUtil;
import com.example.haibeiapp.utils.IRequestCallBack;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    private ListView lvleft, lvright;
    private ImageView returniv, serachiv;
    private TextView tv;
    private List<Category.DataEntity.CategoriesEntity> data;
    private List<Category.DataEntity.CategoriesEntity.SubEntity> list;
    private CategoryLeftAdpter adapter;
    private CategoryRightAdpter rightAdpter;
    private int flag = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initView();
        adapter = new CategoryLeftAdpter(this, data);
        rightAdpter = new CategoryRightAdpter(this, list);
        lvleft.setAdapter(adapter);
        HttpUtil.requestGet(Http.CATEGORY_PATH, new IRequestCallBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Category category = gson.fromJson(result, Category.class);
                data.addAll(category.getData().getCategories());
                list.addAll(data.get(0).getSub());
                adapter.notifyDataSetChanged();
            }
        });
        lvright.setAdapter(rightAdpter);
        lvleft.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (flag != position) {
                    if (tv != null) {
                        tv.setTextColor(Color.GRAY);
                    }
                    tv = (TextView) view.findViewById(R.id.tv_category_listview_left);
                    tv.setTextColor(Color.RED);
                    list.clear();
                    list.addAll(data.get(position).getSub());
                    rightAdpter.notifyDataSetChanged();
                    flag = position;
                } else {
                    Intent intent = new Intent(getApplicationContext(), DetailsCategoryActivity.class);
                    intent.putExtra("name", data.get(position).getName());
                    intent.putExtra("id", Http.PRODUCT_PATH + data.get(position).getId());
                    startActivity(intent);
                }
            }
        });

        returniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        serachiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
        });

        lvright.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailsCategoryActivity.class);
                intent.putExtra("name", list.get(position).getName());
                if (flag != -1) {
                    intent.putExtra("id", Http.PRODUCT_PATH + data.get(flag).getId() + "-" + data.get(flag).getSub().get(position).getId());
                }else {
                    intent.putExtra("id", Http.PRODUCT_PATH + data.get(0).getId() + "-" + data.get(0).getSub().get(position).getId());
                }
                startActivity(intent);
            }
        });
    }


    private void initView() {
        lvleft = (ListView) findViewById(R.id.lv_category_left);
        lvright = (ListView) findViewById(R.id.lv_category_right);
        returniv = (ImageView) findViewById(R.id.iv_category_return);
        serachiv = (ImageView) findViewById(R.id.iv_category_search);
        data = new ArrayList<>();
        list = new ArrayList<>();
    }
}
