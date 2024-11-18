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

public class JayJayDin extends AppCompatActivity {

    private WebView jay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jay_jay_din);

        jay=findViewById(R.id.jayjaydin);

        WebSettings webSettings=jay.getSettings();
        webSettings.setJavaScriptEnabled(true);
        jay.loadUrl("https://www.jaijaidinbd.com/");
        jay.setWebViewClient(new JayJayDin.sameView());

    }

    public class sameView extends WebViewClient {


        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}