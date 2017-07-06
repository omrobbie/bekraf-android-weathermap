package com.omrobbie.weathermap.pojo;

import java.util.List;

public class APIResponse {
    private String cod;
    private List<WeatherItem> list;

    public APIResponse(String cod, List<WeatherItem> list) {
        this.cod = cod;
        this.list = list;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public List<WeatherItem> getList() {
        return list;
    }

    public void setList(List<WeatherItem> list) {
        this.list = list;
    }
}