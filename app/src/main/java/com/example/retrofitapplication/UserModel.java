package com.example.retrofitapplication;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    //POJO class
    @SerializedName("userId")
    private Integer uid;
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private  String title;
    @SerializedName("completed")
    private String completed;


    public UserModel(Integer uid, Integer id, String title, String completed) {
        this.uid = uid;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
