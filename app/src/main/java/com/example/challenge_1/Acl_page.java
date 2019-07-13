package com.example.challenge_1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Acl_page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acl_page);

        getSupportActionBar().setTitle("About ALC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView webView = findViewById(R.id.web_view);
        webView.loadUrl("https://andela.com/alc/");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view , SslErrorHandler handler,SslError errror){
                handler.proceed();
            }
        });

    }
}
