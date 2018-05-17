package com.example.android.mynewsapp;

import java.net.URL;

public class News {

    private String mTitle;

    private String mSection;

    private String mAuthor;

    private String mDate;

    private String mURL;

    public News (String title, String section, String author, String date, String url){
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mDate = date;
        mURL = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }

    public String getURL() {
        return mURL;
    }
}
