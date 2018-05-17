package com.example.android.mynewsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(@NonNull Context context,List<News> newsList) {
        super(context, 0, newsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView title = listItemView.findViewById(R.id.title);
        TextView section = listItemView.findViewById(R.id.section);
        TextView author = listItemView.findViewById(R.id.author);
        TextView date = listItemView.findViewById(R.id.date);

        News currentNews = getItem(position);

        title.setText(currentNews.getTitle());
        section.setText(currentNews.getSection());
        author.setText(currentNews.getAuthor());
        date.setText(currentNews.getDate());

        return listItemView;


    }
}
