package com.example.haibeiapp.ui;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

import android.widget.AdapterView;
import android.widget.ImageView;


import com.example.haibeiapp.R;
import com.example.haibeiapp.adapter.HomeAdapter;
import com.example.haibeiapp.adapter.HomeViewpagerAdapter;
import com.example.haibeiapp.bean.Discover;
import com.example.haibeiapp.bean.Home;
import com.example.haibeiapp.http.Http;
import com.example.haibeiapp.utils.HttpUtil;
import com.example.haibeiapp.utils.IRequestCallBack;
import com.example.haibeiapp.utils.ImageLoader;
import com.google.gson.Gson;
import com.orangegangsters.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import com.orangegangsters.github.swipyrefreshlayout.library.SwipyRefreshLayoutDirection;

import java.util.ArrayList;
import java.util.List;

import in.srain.cube.views.GridViewWithHeaderAndFooter;

public class MainActivity extends AppCompatActivity {
    private SlidingPaneLayout mslidingPaneLayout;
    private SwipyRefreshLayout swipeRefreshLayout;
    private Toolbar mtoolbar;
    private ImageView ivMenu, ivSearch;
    private ImageView ivGridviewHome,ivshoucang;
    private GridViewWithHeaderAndFooter gridView;
    private ViewPager viewPager;
    private HomeAdapter adapter;
    private HomeViewpagerAdapter adapter1;
    private List<View> data1 = new ArrayList<>();
    private List<Home.DataEntity.ProductsEntity> data = new ArrayList<>();
    private List<Discover.DataEntity.TopicsEntity> disList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupHome();
        setupToolBar();
        setupSlidingPaneLayout();
        setupSwipeRefreshLayout();
    }

    private void setupSwipeRefreshLayout() {
        swipeRefreshLayout = (SwipyRefreshLayout) findViewById(R.id.swipyrefreshlayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipyRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh(SwipyRefreshLayoutDirection direction) {
                swipeRefreshLayout.setColorSchemeColors(Color.RED);
                swipeRefreshLayout.setRefreshing(false);
            }
        });
    }

    private void setupHome() {
        gridView = (GridViewWithHeaderAndFooter) findViewById(R.id.gv_shouye);
        adapter = new HomeAdapter(this, data);
        final View view = getLayoutInflater().inflate(R.layout.viewpager_home, null);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        HttpUtil.requestGet(Http.DISCOVER_PATH, new IRequestCallBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Discover discover = gson.fromJson(result, Discover.class);
                disList = discover.getData().getTopics();
                for (int i = 0; i < 5; i++) {
                    Discover.DataEntity.TopicsEntity entity = disList.get(i);

                    View v = getLayoutInflater().inflate(R.layout.gridview_home_vp, null);
                    ImageView iv = (ImageView) v.findViewById(R.id.iv_viewpager_home);
                    String image = entity.getImage();
                    iv.setImageResource(R.mipmap.ic_launcher);
                    iv.setTag(image);
                    if (image!=null){
                    ImageLoader.loadImage(getApplicationContext(), image, iv);
                    }
                    data1.add(v);
                }
                adapter1 = new HomeViewpagerAdapter(data1);
                viewPager.setAdapter(adapter1);

                AbsListView.LayoutParams params = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 400);
                view.setLayoutParams(params);

                int headerViewCount = gridView.getHeaderViewCount();
                if (headerViewCount <= 1) {
                    gridView.addHeaderView(view);
                }
                gridView.setAdapter(adapter);
            }
        });
        int page = 1;
        HttpUtil.requestGet(Http.HOME_PATH + String.valueOf(page), new IRequestCallBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Home home = gson.fromJson(result, Home.class);
                data.addAll(home.getData().getProducts());
                adapter.notifyDataSetChanged();
            }
        });


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                ivGridviewHome = (ImageView) view.findViewById(R.id.imageView);
                ivshoucang = (ImageView) findViewById(R.id.iv_home_shoucang);

                ivGridviewHome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String id = Http.DETAILS_PATH + data.get(position).getCurrent_sku().getId();
                        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
                        intent.putExtra("id",id);
                        startActivity(intent);
                    }
                });

                ivshoucang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),LoadingActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });

    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.ll_loading:
                Intent intent = new Intent(this, LoadingActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_home:
                if (mslidingPaneLayout.isOpen()) {
                    mslidingPaneLayout.closePane();
                } else {
                    mslidingPaneLayout.openPane();
                }
                break;
            case R.id.tv_discover:
                Intent intent1 = new Intent(this, DiscoverActivity.class);
                startActivity(intent1);
                break;
            case R.id.tv_category:
                Intent intent3 = new Intent(this,CategoryActivity.class);
                startActivity(intent3);
                break;
            case R.id.tv_orders:
                Intent intent2 = new Intent(this, LoadingActivity.class);
                startActivity(intent2);
                break;
            case R.id.tv_setting:
                Intent intent4 = new Intent(this,SettingActivity.class);
                startActivity(intent4);
                break;
            case R.id.tv_help:
                Intent intent5 = new Intent(this,HelpActivity.class);
                startActivity(intent5);
                break;
        }
    }

    private void setupSlidingPaneLayout() {
        mslidingPaneLayout = (SlidingPaneLayout) findViewById(R.id.slidingpanelayout);
        mslidingPaneLayout.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {

            }

            @Override
            public void onPanelOpened(View panel) {

            }

            @Override
            public void onPanelClosed(View panel) {

            }
        });
    }

    private void setupToolBar() {
        mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        ivMenu = (ImageView) findViewById(R.id.iv_menu);
        ivSearch = (ImageView) findViewById(R.id.iv_search);
        setSupportActionBar(mtoolbar);
        ivSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mslidingPaneLayout.isOpen()) {
                    mslidingPaneLayout.closePane();
                } else {
                    mslidingPaneLayout.openPane();
                }
            }
        });

    }


}
