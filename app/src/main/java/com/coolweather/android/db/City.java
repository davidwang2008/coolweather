package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2019/2/12 0012.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int citycode;
    private int provinceId;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getCityName()
    {
        return cityName;
    }
    public void setCityName(String name)
    {
        this.cityName=name;
    }

    public int getCityCode()
    {
        return citycode;
    }
    public void setCitycode(int Citycode)
    {
        this.citycode=Citycode;
    }

    public int getprovinceId()
    {
        return provinceId;
    }
    public void setprovinceId(int provinceId)
    {
        this.provinceId=provinceId;
    }
}
