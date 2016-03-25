package com.sprhib.pojo.calender;

public class Country
{
    private String ctrys;

    private Ctry[] ctry;

    public String getCtrys ()
    {
        return ctrys;
    }

    public void setCtrys (String ctrys)
    {
        this.ctrys = ctrys;
    }

    public Ctry[] getCtry ()
    {
        return ctry;
    }

    public void setCtry (Ctry[] ctry)
    {
        this.ctry = ctry;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ctrys = "+ctrys+", ctry = "+ctry+"]";
    }
}