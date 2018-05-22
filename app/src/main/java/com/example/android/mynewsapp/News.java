package com.example.android.mynewsapp;

import android.graphics.Bitmap;


public class News {

    private String mTitle;

    private String mSection;

    private String mAuthor;

    private String mDate;

    private String mURL;

    private Bitmap mImage;

    // Set one constructor, containing all the info from the News object
    public News(String title, String section, String author, String date, String url, Bitmap image) {
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mDate = date;
        mURL = url;
        mImage = image;
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

    public String getUrl() {
        return mURL;
    }

    public Bitmap getImage() {
        return mImage;
    }
}
