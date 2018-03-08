package com.example.gurjitsingh3499.thecw.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gurjitsingh3499.thecw.R;
import com.example.gurjitsingh3499.thecw.holders.ContentViewHolder;
import com.example.gurjitsingh3499.thecw.model.Content;

import java.util.ArrayList;

/**
 * Created by gurjitsingh on 3/8/18.
 */

public class ContentAdapter extends RecyclerView.Adapter<ContentViewHolder> {
    private ArrayList<Content> contents;

    public ContentAdapter(ArrayList<Content> contents) {
        this.contents = contents;
    }

    @Override
    public ContentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new ContentViewHolder(contentCard);
    }

    @Override
    public void onBindViewHolder(ContentViewHolder holder, int position) {
        Content content = contents.get(position);
        holder.updateUI(content);

    }

    @Override
    public int getItemCount() {
        return contents.size();
    }
}
