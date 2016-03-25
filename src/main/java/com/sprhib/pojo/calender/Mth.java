package com.sprhib.pojo.calender;

public class Mth
{
    private Mch[] mch;

    private String mchs;

    public Mch[] getMch ()
    {
        return mch;
    }

    public void setMch (Mch[] mch)
    {
        this.mch = mch;
    }

    public String getMchs ()
    {
        return mchs;
    }

    public void setMchs (String mchs)
    {
        this.mchs = mchs;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [mch = "+mch+", mchs = "+mchs+"]";
    }
}