package com.example.haibeiapp.ui;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.haibeiapp.R;
import com.example.haibeiapp.ui.frg.LoadingFragment;
import com.example.haibeiapp.ui.frg.LognFragment;

public class LoadingActivity extends AppCompatActivity {
    private RadioGroup rgselt;
    private ImageView ivReturn;
    private Toolbar loadingtoolbar;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private LoadingFragment loadingFragment;
    private LognFragment lognFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        initView();

        RadioButton childAt = (RadioButton) rgselt.getChildAt(0);
        childAt.setChecked(true);
    }

    private void initView() {
        ivReturn = (ImageView) findViewById(R.id.iv_return_grey);
        ivReturn = (ImageView) findViewById(R.id.iv_return_grey);
        loadingtoolbar = (Toolbar) findViewById(R.id.loading_toolbar);
        rgselt = (RadioGroup) findViewById(R.id.rg_slt);
        setSupportActionBar(loadingtoolbar);
        ivReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rgselt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                manager = getSupportFragmentManager();
                transaction = manager.beginTransaction();
                switch (checkedId) {
                    case R.id.rb_loading:
                        if (loadingFragment == null) {
                            loadingFragment = LoadingFragment.newInstance();
                            transaction.add(R.id.rl_frg, loadingFragment, "登陆");
                            if (lognFragment != null) {
                                transaction.hide(lognFragment);
                            }
                        } else {
                            transaction.show(loadingFragment);
                            if (lognFragment != null) {
                                transaction.hide(lognFragment);
                            }
                        }
                        break;
                    case R.id.rb_logn:
                        if (lognFragment == null) {
                            lognFragment = LognFragment.newInstance();
                            transaction.add(R.id.rl_frg, lognFragment, "注册");
                            if (loadingFragment != null) {
                                transaction.hide(loadingFragment);
                            }
                        } else {
                            transaction.show(lognFragment);
                            if (loadingFragment != null) {
                                transaction.hide(loadingFragment);
                            }
                        }
                        break;
                }
                transaction.commit();
            }
        });
    }
}
