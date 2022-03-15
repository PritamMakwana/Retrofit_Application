package com.example.retrofitapplication.api;

import com.example.retrofitapplication.model.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("/todos")
    Call<List<UserModel>>  getAllUser();
}
