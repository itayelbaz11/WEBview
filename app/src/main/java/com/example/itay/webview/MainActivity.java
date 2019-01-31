package com.example.itay.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    Button btn,btn2;
    EditText et1,et2,et3;
    String aa,b,c,URL="https://www.google.com/search?ei=DXVCXKS6LbHrxgPV-YGYDw&q=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv=(WebView) findViewById(R.id.wv);
        btn=(Button) findViewById(R.id.btn);
        btn2=(Button) findViewById(R.id.btn2);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(EditText) findViewById(R.id.et3);

        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());
    }


    public void goToSite(View view) {
        aa=et1.getText().toString();
        b=et2.getText().toString();
        c=et3.getText().toString();
        URL=URL+aa+"x%5E2"+b+"x%2B"+c+"&oq";
        wv.loadUrl(URL);

    }

    public void clear(View view) {
        et1.setText("");
        et2.setText("");
        et3.setText("");
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }

    }


}
