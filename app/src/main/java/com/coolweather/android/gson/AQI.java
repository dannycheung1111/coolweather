package com.coolweather.android.gson;

/**
 * Created by dannycheung1111 on 2018/2/9.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
