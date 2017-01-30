package io.github.jisung.rigidwebview.sample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import io.github.jisung.wrapcontentwebview.sample.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview1 = (WebView) findViewById(R.id.webview1);
        WebView webview2 = (WebView) findViewById(R.id.webview2);

        webview1.loadUrl("https://developer.android.com/design/media/hero-material-design.png?hl=id");
        //webview2.loadUrl("https://tctechcrunch2011.files.wordpress.com/2014/07/screen-shot-2014-07-24-at-1-37-07-pm.png?w=680&h=343");
        webview2.loadUrl("http://www.dealstreetasia.com/stories/viva-republica-ropes-23-m-series-b-and-expands-through-two-new-products-54634/");
    }

}
