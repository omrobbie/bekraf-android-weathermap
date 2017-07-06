package com.omrobbie.weathermap.pojo;

import java.util.List;

public class WeatherItem {
    private long dt;
    private String dt_txt;
    private Main main;
    private List<WeatherData> weather;

    public WeatherItem(long dt, String dt_txt, Main main) {
        this.dt = dt;
        this.dt_txt = dt_txt;
        this.main = main;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<WeatherData> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherData> weather) {
        this.weather = weather;
    }
}