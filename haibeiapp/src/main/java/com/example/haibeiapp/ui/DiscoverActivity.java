package com.example.haibeiapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.haibeiapp.R;
import com.example.haibeiapp.adapter.DiscoverAdapter;
import com.example.haibeiapp.bean.Discover;
import com.example.haibeiapp.http.Http;
import com.example.haibeiapp.utils.HttpUtil;
import com.example.haibeiapp.utils.IRequestCallBack;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class DiscoverActivity extends AppCompatActivity {
    private ImageView imageView;
    private ListView lvDiscover;
    private DiscoverAdapter adapter;
    private List<Discover.DataEntity.TopicsEntity> data= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);
        initView();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        adapter = new DiscoverAdapter(this,data);
        lvDiscover.setAdapter(adapter);

        HttpUtil.requestGet(Http.DISCOVER_PATH, new IRequestCallBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Discover discover = gson.fromJson(result, Discover.class);
                data.addAll(discover.getData().getTopics());
                adapter.notifyDataSetChanged();
            }
        });

        lvDiscover.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),ListDiscoverActivity.class);
                intent.putExtra("img",data.get(position).getImage());
                intent.putExtra("path",Http.LISTDISCOVER_PATH + (position+1)+ "/products?size=20&p=1");
                startActivity(intent);
            }
        });
    }

    private void initView() {
        lvDiscover = (ListView) findViewById(R.id.lv_discover);
        imageView = (ImageView) findViewById(R.id.iv_discover_return);
    }
}
