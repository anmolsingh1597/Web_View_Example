package com.lambton.web_view_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initials();
    }
    public void initials(){

        String webHtml = "<h1>Hello World</h1>";
        webView = findViewById(R.id.webViewId);
        webView.loadData(webHtml,"text/html","utf8");


    }
}
