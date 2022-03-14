package com.example.retrofitapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private AdapterUser adapterUser;
    private RecyclerView rv ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.Home_rv);

        Api api = RetrofitClientInsert.getRetrofitUsers().create(Api.class);

        Call<List<UserModel>> call = api.getAllUser();

        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                getDataOnuser(response.body());
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "error  in respones" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void getDataOnuser(List<UserModel> body) {

        adapterUser = new AdapterUser(body,MainActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapterUser);

    }
}