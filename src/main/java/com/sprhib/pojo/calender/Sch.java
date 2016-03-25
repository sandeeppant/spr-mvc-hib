package com.sprhib.pojo.calender;

public class Sch
{
    private Series series;

    private Country country;

    private Mth mth;

    public Series getSeries ()
    {
        return series;
    }

    public void setSeries (Series series)
    {
        this.series = series;
    }

    public Country getCountry ()
    {
        return country;
    }

    public void setCountry (Country country)
    {
        this.country = country;
    }

    public Mth getMth ()
    {
        return mth;
    }

    public void setMth (Mth mth)
    {
        this.mth = mth;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [series = "+series+", country = "+country+", mth = "+mth+"]";
    }
}