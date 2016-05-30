package com.example.haibeiapp.ui;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.haibeiapp.R;
import com.example.haibeiapp.adapter.HomeViewpagerAdapter;
import com.example.haibeiapp.bean.Details;
import com.example.haibeiapp.bean.Home;
import com.example.haibeiapp.http.Http;
import com.example.haibeiapp.utils.HttpUtil;
import com.example.haibeiapp.utils.IRequestCallBack;
import com.example.haibeiapp.utils.ImageLoader;
import com.google.gson.Gson;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton ibBack,ibHeart,ibChart;
    private Button btnAdd;
    private ViewPager vpImage;
    private TextView tvName,tvCurPrice,tvOldPrice,tvSale,tvDoodInfo,tvShoperName,tvShoperName1,tvShopName,tvClloct;
    private RadioGroup rg;
    private RelativeLayout rlLeft,rlRight;

    private Details details = new Details();
    private Details.DataBean.ProductBean product;
    private List<String> list = new ArrayList<>();
    private List<View> data = new ArrayList<>();
    private HomeViewpagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String id = getIntent().getStringExtra("id");
        initView();
        adapter = new HomeViewpagerAdapter(data);
        vpImage.setAdapter(adapter);
        HttpUtil.requestGet(id, new IRequestCallBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                details = gson.fromJson(result, Details.class);
                product = details.getData().getProduct();
                tvName.setText(product.getName());
                int real_price = product.getCurrent_sku().getReal_price().getCNY();
                int list_price = product.getCurrent_sku().getList_price().getCNY();
                DecimalFormat decimalFormat = new DecimalFormat("#.0");
                String format = decimalFormat.format(list_price/100);
                String format1 = decimalFormat.format(real_price/ 100);
                String format2 = decimalFormat.format(real_price * 10 / list_price);
                tvSale.setText(format2+"折");
                tvOldPrice.setText("￥"+format);
                tvCurPrice.setText("￥"+format1);

                tvDoodInfo.setText(product.getDesc());
                tvShoperName.setText(product.getLocation());
                tvShoperName1.setText(product.getMerchant().getName());
                tvShopName.setText(product.getName());
                int fav_count = product.getFav_count();
                tvClloct.setText(String.valueOf(fav_count));

                for (int i = 0; i <details.getData().getProduct().getImages().size() ; i++) {
                    list.add(details.getData().getProduct().getImages().get(i).getThumb());
                    list.add(details.getData().getProduct().getImages().get(i).getUrl());
                }
                for (int i = 0; i < list.size(); i++) {
                    ImageView iv = new ImageView(getApplicationContext());
                    AbsListView.LayoutParams params = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                    iv.setLayoutParams(params);

                    iv.setImageResource(R.mipmap.ic_launcher);
                    iv.setScaleType(ImageView.ScaleType.FIT_XY);
                    iv.setTag(list.get(i));

                    ImageLoader.loadImage(getApplicationContext(), list.get(i), iv);
                    data.add(iv);
                }
                adapter.notifyDataSetChanged();
            }
        });


        initListener();
    }

    private void initListener() {
        btnAdd.setOnClickListener(this);
        ibChart.setOnClickListener(this);
        ibBack.setOnClickListener(this);
        ibHeart.setOnClickListener(this);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.tv_detail_goods_detail:
                        rlLeft.setVisibility(View.VISIBLE);
                        rlRight.setVisibility(View.GONE);
                        break;
                    case R.id.tv_detail_goods_other:
                        rlRight.setVisibility(View.VISIBLE);
                        rlLeft.setVisibility(View.GONE);
                        break;
                }
            }
        });
    }

    private void initView() {
        ibBack = (ImageButton) findViewById(R.id.ib_detail_back);
        ibHeart = (ImageButton) findViewById(R.id.ib_detail_heart);
        ibChart = (ImageButton) findViewById(R.id.ib_detail_cart);
        vpImage = (ViewPager) findViewById(R.id.vp_detail);
        tvName = (TextView) findViewById(R.id.tv_detail_name);
        tvCurPrice = (TextView) findViewById(R.id.tv_detail_current_price);
        tvOldPrice = (TextView) findViewById(R.id.tv_detail_old_price);
        tvSale = (TextView) findViewById(R.id.tv_detail_sale);
        tvShoperName = (TextView) findViewById(R.id.shoper_name);
        tvShoperName1 = (TextView) findViewById(R.id.shoper_name1);
        tvShopName = (TextView) findViewById(R.id.goods_name);
        tvClloct = (TextView) findViewById(R.id.tv_clloct);
        btnAdd = (Button) findViewById(R.id.ib_detail_addcart);
        rg = (RadioGroup) findViewById(R.id.ll_detail_one);
        rlLeft = (RelativeLayout) findViewById(R.id.rl_detail_bottom1);
        rlRight = (RelativeLayout) findViewById(R.id.rl_detail_bottom2);
        tvDoodInfo = (TextView) findViewById(R.id.tv_detail_good_info);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ib_detail_back:
                finish();
                break;
            case R.id.ib_detail_addcart:
                Intent intent = new Intent(this,LoadingActivity.class);
                startActivity(intent);
                break;
            case R.id.ib_detail_cart:
                Intent intent1 = new Intent(this,LoadingActivity.class);
                startActivity(intent1);
                break;
            case R.id.ib_detail_heart:
                Intent intent2 = new Intent(this,LoadingActivity.class);
                startActivity(intent2);
                break;
        }
    }

}
