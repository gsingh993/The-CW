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

    public ArrayList<Content> getContent(){ //mimic an internet database
        ArrayList<Content> list = new ArrayList<>();
        list.add(new Content("The Flash","flash","The Reverse", "01/01/2018"));
        list.add(new Content("Supergirl","superman","General Zod", "01/01/2018"));
        list.add(new Content("Arrow","arrow","Felicity and Friends", "01/01/2018"));
        return list;
    }
}
