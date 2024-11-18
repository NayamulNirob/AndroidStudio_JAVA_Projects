package com.neyamul.newsall;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TheFinancialExpress extends AppCompatActivity {

    private WebView fe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_the_financial_express);

        fe=findViewById(R.id.finance);

        WebSettings webSettings=fe.getSettings();
        webSettings.setJavaScriptEnabled(true);
        fe.loadUrl("https://thefinancialexpress.com.bd/");
        fe.setWebViewClient(new TheFinancialExpress.sameView());

    }

    public class sameView extends WebViewClient {


        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}