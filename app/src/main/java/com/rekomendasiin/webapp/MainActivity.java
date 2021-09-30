package com.rekomendasiin.webapp;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
        WebView webview;
        WebSettings webSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = findViewById(R.id.webview1);
        webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://rekomendasiin.com");
    }
    public void HOME(View view) {
        webview.loadUrl("https://rekomendasiin.com");
    }
    public void MYCART(View view) {
        webview.loadUrl("https://rekomendasiin.com/belanja"); }
    public void MYORDER(View view) {
        webview.loadUrl("https://rekomendasiin.com/pesanan_saya"); }

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        }
    }
}