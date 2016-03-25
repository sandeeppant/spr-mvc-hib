package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LiveMatches
{
    private Mchdata mchdata;

    public Mchdata getMchdata ()
    {
        return mchdata;
    }

    public void setMchdata (Mchdata mchdata)
    {
        this.mchdata = mchdata;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [mchdata = "+mchdata+"]";
    }
}
