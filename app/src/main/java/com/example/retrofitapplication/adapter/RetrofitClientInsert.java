package com.example.retrofitapplication.adapter;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInsert {

    private static Retrofit sRetrofit;
    private static final  String BASE_URL = "https://jsonplaceholder.typicode.com/todos/";


   public  static Retrofit getRetrofitUsers(){

       if(sRetrofit == null){

           sRetrofit = new Retrofit.Builder()
                   .baseUrl(BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();

       }
       return sRetrofit;
   }
}
