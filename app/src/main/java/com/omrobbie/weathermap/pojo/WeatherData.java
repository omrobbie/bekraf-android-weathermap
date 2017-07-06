package com.omrobbie.weathermap.pojo;

import com.google.gson.annotations.SerializedName;

public class WeatherData {
    private int id;

    @SerializedName("main")
    private String NamaCuaca;

    public WeatherData(int id, String main) {
        this.id = id;
        this.NamaCuaca = main;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return NamaCuaca;
    }

    public void setMain(String main) {
        this.NamaCuaca = main;
    }
}
