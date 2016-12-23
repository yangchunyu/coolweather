package com.example.yangchunyu02.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yangchunyu02 on 2016/12/23.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private int cityId;
    private String weatherId;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
