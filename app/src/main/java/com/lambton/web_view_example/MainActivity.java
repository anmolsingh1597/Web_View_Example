package com.lambton.web_view_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

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

        // Load from Html String Data
//        webView.loadData(webHtml,"text/html","utf8");

        // Load from URL
//        webView.loadUrl("https://www.google.com");
//        webView.setWebViewClient(new WebViewClient());

        // Load from Assets
        AssetManager assetManager = this.getAssets();
        try{
            InputStream inputStream = assetManager.open("test.html");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            String content = new String(buffer, StandardCharsets.UTF_8);

            webView.loadData(content,"text/html","utf-8");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
