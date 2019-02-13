package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2019/2/12 0012.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getCountyName()
    {
        return this.countyName;
    }
    public void setCountyName(String countyName)
    {
        this.countyName=countyName;
    }

    public String getweatherId()
    {
        return this.weatherId;
    }
    public void setweatherId(String weatherId)
    {
        this.countyName=weatherId;
    }

    public int getcityId()
    {
        return this.cityId;
    }
    public void setcityId(int cityId)
    {
        this.cityId=cityId;
    }

}
