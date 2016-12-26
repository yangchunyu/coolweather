package com.example.yangchunyu02.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yangchunyu02 on 2016/12/26.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
