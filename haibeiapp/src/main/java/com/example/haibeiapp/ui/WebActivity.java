package com.example.haibeiapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.haibeiapp.R;

public class WebActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        String url = getIntent().getStringExtra("url");
        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl(url);
    }
}
