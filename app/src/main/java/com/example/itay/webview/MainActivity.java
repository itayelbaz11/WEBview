package com.example.itay.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    Button btn;
    String URL="https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57j69i60l3j0l2.1244j0j7&sourceid=chrome&ie=UTF-8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv=(WebView) findViewById(R.id.wv);
        btn=(Button) findViewById(R.id.btn);

        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());
    }

    public void btn(View view) {
        wv.loadUrl(URL);
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }

    }


}
