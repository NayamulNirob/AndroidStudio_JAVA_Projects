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

public class BonikBarta extends AppCompatActivity {

    private WebView bonikbarta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonik_barta);

        bonikbarta=findViewById(R.id.bonikbarta);

        WebSettings webSettings=bonikbarta.getSettings();
        webSettings.setJavaScriptEnabled(true);
        bonikbarta.setWebViewClient(new BonikBarta.sameView());
        bonikbarta.loadUrl("https://bonikbarta.com/");

    }

    public class sameView extends WebViewClient {


        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}