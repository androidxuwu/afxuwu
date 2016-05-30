package com.example.liwushuo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.liwushuo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
 @BindView(R.id.guide_toolbar)Toolbar mToolbar;
 @BindView(R.id.home_raduigroup)RadioGroup mRadioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupToolbar();
        setupRadioGroup();

        RadioButton button = (RadioButton) mRadioGroup.getChildAt(0);
        button.setChecked(true);
    }

    private void setupRadioGroup() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.guide_rb:
                        break;
                    case R.id.single_product_rb:
                        break;
                    case R.id.category_rb:
                        break;
                    case R.id.my_rb:
                        break;
                }
            }
        });
    }

    private void setupToolbar() {

    }
}
