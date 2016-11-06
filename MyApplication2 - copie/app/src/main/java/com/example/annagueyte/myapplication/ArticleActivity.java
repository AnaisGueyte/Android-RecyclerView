package com.example.annagueyte.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by annagueyte on 05/11/2016.
 */

public class ArticleActivity extends Activity {

    public static String article_title = "title";
    public static String htmlcontent = "htmlContent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fakenewslayout);

        String title = getIntent().getStringExtra(article_title);
        String content = getIntent().getStringExtra(htmlcontent);

        setTitle(title);

        WebView webView = (WebView) findViewById(R.id.mywebView);

        webView.loadData(content, "text/html; charset=UTF-8", null);

    }

}
