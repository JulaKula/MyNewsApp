package com.example.android.mynewsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;


public class NewsLoader extends AsyncTaskLoader<List<News>> {

private String requestUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        requestUrl = url;
    }

    @Override
    public List<News> loadInBackground() {
        List<News> newsList = QueryUtils.fetchEarthquakeData(requestUrl);

        return newsList;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}
