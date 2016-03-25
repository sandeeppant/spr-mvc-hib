package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tme
{
    @JsonProperty("Dt")
    private String dt;

    private String enddt;

    @JsonProperty("stTme")
    private String sttme;

    public String getDt ()
    {
        return dt;
    }

    public void setDt (String dt)
    {
        this.dt = dt;
    }

    public String getEnddt ()
    {
        return enddt;
    }

    public void setEnddt (String enddt)
    {
        this.enddt = enddt;
    }

    public String getSttme ()
    {
        return sttme;
    }

    public void setSttme (String sttme)
    {
        this.sttme = sttme;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Dt = "+dt+", enddt = "+enddt+", stTme = "+sttme+"]";
    }
}
