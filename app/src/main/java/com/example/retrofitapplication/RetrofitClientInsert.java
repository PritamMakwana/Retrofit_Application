package com.example.retrofitapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInsert {

    private static Retrofit retrofit;
    private static final  String BASE_URL = "https://jsonplaceholder.typicode.com/todos/";


   public  static Retrofit getRetrofitUsers(){

       if(retrofit == null){

           retrofit = new Retrofit.Builder()
                   .baseUrl(BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();

       }
       return retrofit;
   }
}
