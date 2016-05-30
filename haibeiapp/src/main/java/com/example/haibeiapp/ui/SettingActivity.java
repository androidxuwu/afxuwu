package com.example.haibeiapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haibeiapp.R;

public class SettingActivity extends AppCompatActivity {
    private TextView tvAdress;
    private ImageView ivReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        tvAdress = (TextView) findViewById(R.id.tv_address);
        ivReturn = (ImageView) findViewById(R.id.iv_setting_return);

        ivReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tvAdress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LoadingActivity.class);
                startActivity(intent);
            }
        });
    }
}
