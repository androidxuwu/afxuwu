package com.example.haibeiapp.ui;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haibeiapp.R;
import com.example.haibeiapp.http.Http;
import com.example.haibeiapp.ui.frg.CategoryFragment;
import com.example.haibeiapp.ui.frg.ListFragment;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class FoundActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView returnIv, listIv;
    private TextView nameTv;
    private boolean falg = true;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private CategoryFragment categoryFragment;
    private ListFragment listFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found);
        initView();

        String id = getIntent().getStringExtra("id");
        String encode ="";
        try {
            encode = URLEncoder.encode(id, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        final String path = "http://apicn.seashellmall.com/search/product/?q="+ encode +"&size=20";

        nameTv.setText(id);
        returnIv.setOnClickListener(this);
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        falg = false;
        if (categoryFragment == null) {
            categoryFragment = CategoryFragment.newInstance(path, "");
            transaction.add(R.id.rl_category_list, categoryFragment, "list");
            if (listFragment != null) {
                transaction.hide(listFragment);
            }
        } else {
            transaction.show(categoryFragment);
            if (listFragment != null) {
                transaction.hide(listFragment);
            }
        }
        transaction.commit();
        listIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = getSupportFragmentManager();
                transaction = manager.beginTransaction();
                if (falg) {
                    listIv.setImageResource(R.mipmap.list);
                    falg = false;
                    if (listFragment == null) {
                        listFragment = ListFragment.newInstance(path, "");
                        transaction.add(R.id.rl_category_list, listFragment, "list");
                        if (categoryFragment != null) {
                            transaction.hide(categoryFragment);
                        }
                    } else {
                        transaction.show(listFragment);
                        if (categoryFragment != null) {
                            transaction.hide(categoryFragment);
                        }
                    }
                } else {
                    listIv.setImageResource(R.mipmap.category);
                    falg = true;
                    if (categoryFragment == null) {
                        categoryFragment = CategoryFragment.newInstance(path, "");
                        transaction.add(R.id.rl_category_list, categoryFragment, "list");
                        if (listFragment != null) {
                            transaction.hide(listFragment);
                        }
                    } else {
                        transaction.show(categoryFragment);
                        if (listFragment != null) {
                            transaction.hide(listFragment);
                        }
                    }
                }
                transaction.commit();
            }
        });
    }

    private void initView() {
        returnIv = (ImageView) findViewById(R.id.iv_datalis_category_return);
        listIv = (ImageView) findViewById(R.id.iv_category_list);
        nameTv = (TextView) findViewById(R.id.tv_details_name);

    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
