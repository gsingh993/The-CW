package com.example.gurjitsingh3499.thecw.model;

/**
 * Created by gurjitsingh on 3/8/18.
 */

public class Content {
    final String DRAWABLE = "drawable/";
    private String title;
    private String imageUri;
    private String episodeTitle;
    private String date;

    public Content(String title, String imageUri, String episodeTitle, String date) {
        this.title = title;
        this.imageUri = imageUri;
        this.episodeTitle = episodeTitle;
        this.date = date;
    }


    public String getTitle() {
        return title;
    }

    public String getImageUri() {
        return DRAWABLE+imageUri;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public String getDate() {
        return date;
    }
}
