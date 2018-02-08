package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dannycheung1111 on 2018/2/8.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
