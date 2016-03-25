package com.sprhib.pojo.calender;

public class Mch
{
    private String tm;

    private String desc;

    private String ddt;

    private String mnth_yr;

    private String vnu;

    private String srs;

    public String getTm ()
    {
        return tm;
    }

    public void setTm (String tm)
    {
        this.tm = tm;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public String getDdt ()
    {
        return ddt;
    }

    public void setDdt (String ddt)
    {
        this.ddt = ddt;
    }

    public String getMnth_yr ()
    {
        return mnth_yr;
    }

    public void setMnth_yr (String mnth_yr)
    {
        this.mnth_yr = mnth_yr;
    }

    public String getVnu ()
    {
        return vnu;
    }

    public void setVnu (String vnu)
    {
        this.vnu = vnu;
    }

    public String getSrs ()
    {
        return srs;
    }

    public void setSrs (String srs)
    {
        this.srs = srs;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [tm = "+tm+", desc = "+desc+", ddt = "+ddt+", mnth_yr = "+mnth_yr+", vnu = "+vnu+", srs = "+srs+"]";
    }
}