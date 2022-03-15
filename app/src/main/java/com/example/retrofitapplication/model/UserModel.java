package com.example.retrofitapplication.model;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    //POJO class
    @SerializedName("userId")
    private Integer mUserid;
    @SerializedName("id")
    private Integer mId;
    @SerializedName("title")
    private  String mTitle;
    @SerializedName("completed")
    private String mCompleted;


    public UserModel(Integer mUserid, Integer mId, String mTitle, String mCompleted) {
        this.mUserid = mUserid;
        this.mId = mId;
        this.mTitle = mTitle;
        this.mCompleted = mCompleted;
    }

    public Integer getmUserid() {
        return mUserid;
    }

    public void setmUserid(Integer mUserid) {
        this.mUserid = mUserid;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmCompleted() {
        return mCompleted;
    }

    public void setmCompleted(String mCompleted) {
        this.mCompleted = mCompleted;
    }
}
