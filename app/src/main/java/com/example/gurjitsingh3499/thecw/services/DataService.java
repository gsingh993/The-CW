package com.example.gurjitsingh3499.thecw.services;

import com.example.gurjitsingh3499.thecw.model.Content;

import java.util.ArrayList;

/**
 * Created by gurjitsingh on 3/8/18.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Content> getContent(){
        ArrayList<Content> list = new ArrayList<>();
        list.add(new Content("Title","ic_movie_black_48dp","Episode Title", "Date"));
        list.add(new Content("Title","ic_movie_black_48dp","Episode Title", "Date"));
        list.add(new Content("Title","ic_movie_black_48dp","Episode Title", "Date"));
        return list;
    }
}
