package com.l1dev.restservice.domain;

import java.math.BigDecimal;

public class Main
{
    private BigDecimal temp;

    private String temp_min;

    private String humidity;

    private String pressure;

    private String temp_max;

    public BigDecimal getTemp ()
    {
        return temp;
    }

    public void setTemp (BigDecimal temp)
    {
        this.temp = temp;
    }

    public String getTemp_min ()
    {
        return temp_min;
    }

    public void setTemp_min (String temp_min)
    {
        this.temp_min = temp_min;
    }

    public String getHumidity ()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getPressure ()
    {
        return pressure;
    }

    public void setPressure (String pressure)
    {
        this.pressure = pressure;
    }

    public String getTemp_max ()
    {
        return temp_max;
    }

    public void setTemp_max (String temp_max)
    {
        this.temp_max = temp_max;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [temp = "+temp+", temp_min = "+temp_min+", humidity = "+humidity+", pressure = "+pressure+", temp_max = "+temp_max+"]";
    }
}

