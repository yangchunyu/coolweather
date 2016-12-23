package com.example.yangchunyu02.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yangchunyu02 on 2016/12/23.
 */

public class City extends DataSupport {
    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
}
