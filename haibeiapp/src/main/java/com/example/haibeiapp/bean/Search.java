package com.example.haibeiapp.bean;

/**
 * Created by sxh on 2016/5/26.
 */
public class Search {
    private int id;
    private String title;
    private String data;

    public Search() {
    }

    public Search(String title) {
        this.title = title;
    }

    public Search(String title, String data) {
        this.title = title;
        this.data = data;
    }

    public Search(int id, String title, String data) {

        this.id = id;
        this.title = title;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String time) {
        this.data = time;
    }
}
