package com.example.gurjitsingh3499.thecw.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gurjitsingh3499.thecw.R;
import com.example.gurjitsingh3499.thecw.model.Content;

/**
 * Created by gurjitsingh on 3/8/18.
 */

public class ContentViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView title;
    private TextView episodeTitle;
    private TextView date;

    public ContentViewHolder(View itemView) {
        super(itemView);

        this.imageView = (ImageView) itemView.findViewById(R.id.image_main);
        this.title = (TextView)itemView.findViewById(R.id.showtitle_cd);
        this.episodeTitle = (TextView)itemView.findViewById(R.id.eptitle);
        this.date = (TextView)itemView.findViewById(R.id.date);
    }

    public void updateUI(Content content){
        String uri = content.getImageUri();
        int resource = imageView.getResources().getIdentifier(uri,null,imageView.getContext().getPackageName());
        imageView.setImageResource(resource);

        title.setText(content.getTitle());
        episodeTitle.setText(content.getEpisodeTitle());
        date.setText(content.getDate());

    }
}
