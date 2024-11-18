package com.neyamul.newsall;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;


public class BusinessStandard extends AppCompatActivity {

    private WebView businessStandard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_standard);

        businessStandard=findViewById(R.id.businessStandard);

        WebSettings webSettings=businessStandard.getSettings();
        webSettings.setJavaScriptEnabled(true);
        businessStandard.setWebViewClient(new BusinessStandard.sameView());
        businessStandard.loadUrl("https://www.tbsnews.net/");

    }

    public class sameView extends WebViewClient {


        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}