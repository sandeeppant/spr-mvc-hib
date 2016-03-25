package com.sprhib.pojo.calender;

public class Series
{
    private String srss;

    private Srs[] srs;

    public String getSrss ()
    {
        return srss;
    }

    public void setSrss (String srss)
    {
        this.srss = srss;
    }

    public Srs[] getSrs ()
    {
        return srs;
    }

    public void setSrs (Srs[] srs)
    {
        this.srs = srs;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [srss = "+srss+", srs = "+srs+"]";
    }
}
