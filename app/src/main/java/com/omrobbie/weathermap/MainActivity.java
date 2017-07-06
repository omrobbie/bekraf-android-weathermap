package com.omrobbie.weathermap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.omrobbie.weathermap.adapter.WeatherAdapter;
import com.omrobbie.weathermap.pojo.APIResponse;
import com.omrobbie.weathermap.pojo.Main;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private WeatherAdapter adapter;
    private APIResponse apiResponse;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv);
        loadData();
    }

    private void loadData() {
        String URL = "http://api.openweathermap.org/data/2.5/forecast?q=London,us&mode=json&appid=c2818357c736d789a6086696fc8d9b30&cnt=16&units=metric";
        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(
                Request.Method.GET,
                URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.i("response", response);

                        try {
                            apiResponse = gson.fromJson(response, APIResponse.class);
                            setupRV();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        /*if (apiResponse != null) {
                            Log.i("size data", ""+apiResponse.getList().size());
                        } else {
                            Toast.makeText(MainActivity.this, "parsing gagal", Toast.LENGTH_SHORT).show();
                        }*/
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                }
        );

        queue.add(stringRequest);
    }

    private void setupRV() {
        adapter = new WeatherAdapter(apiResponse.getList());
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
}