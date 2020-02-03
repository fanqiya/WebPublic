package com.xq.webpublic;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MyWebView extends WebView {

    public MyWebView(Context context) {
        super(context);
        init();
    }

    private void init() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
    }


}

