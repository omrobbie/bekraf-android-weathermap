package com.omrobbie.weathermap.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.omrobbie.weathermap.R;
import com.omrobbie.weathermap.ViewHolder.WeatherViewHolder;
import com.omrobbie.weathermap.pojo.WeatherItem;

import java.util.ArrayList;
import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder> {

    private List<WeatherItem> list = new ArrayList<>();

    public WeatherAdapter(List<WeatherItem> list) {
        this.list = list;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_weather, parent, false);
        return new WeatherViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}