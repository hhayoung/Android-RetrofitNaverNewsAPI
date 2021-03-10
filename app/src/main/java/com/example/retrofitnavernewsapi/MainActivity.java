package com.example.retrofitnavernewsapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView tv_result;
    List<Items> items = new ArrayList<>();
    NaverNewsApi naverNewsApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_result = (TextView)findViewById(R.id.tv_result);

        String clientID = "AINAdj8QhDDClfeZPneY";
        String clientSecret = "DM8CS94a1s";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(naverNewsApi.API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        naverNewsApi = retrofit.create(NaverNewsApi.class);

        Call<Result> call = naverNewsApi.getItems(clientID, clientSecret,"test", 3, "date");

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                if(!response.isSuccessful()) {
                    tv_result.setText("code : " + response.code());
                    return;
                }

//                Log.e("Test", String.valueOf(response.body()));

                Result result = response.body();
                List<Items> items = result.getItems();

                String content = "";
                for(Items item : items) {
                    content += "Title: " + item.getTitle() + "\n";
                    content += "description: " + item.getDescription() + "\n";
                    content += "Link: " + item.getLink() + "\n";
                }
                tv_result.setText(content);

            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });
    }
}