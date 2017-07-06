package com.omrobbie.weathermap.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.omrobbie.weathermap.R;
import com.omrobbie.weathermap.pojo.WeatherItem;

public class WeatherViewHolder extends RecyclerView.ViewHolder {

    private TextView time;
    private TextView minTemp;
    private TextView maxTemp;
    private TextView weatherName;

    public WeatherViewHolder(View itemView) {
        super(itemView);

        time = (TextView) itemView.findViewById(R.id.tv_time);
        minTemp = (TextView) itemView.findViewById(R.id.tv_min_temp);
        maxTemp = (TextView) itemView.findViewById(R.id.tv_max_temp);
        weatherName = (TextView) itemView.findViewById(R.id.tv_weather_name);
    }

    public void bind(WeatherItem data) {
        weatherName.setText(data.getWeather().get(0).getMain());

        time.setText(data.getDt_txt());
        minTemp.setText("" + data.getMain().getReadableTemp(data.getMain().getTemp_min()));
        maxTemp.setText("" + data.getMain().getReadableTemp(data.getMain().getTemp_max()));
    }
}