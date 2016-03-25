package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mscr
{
    private Inngsdetail inngsdetail;

    @JsonProperty("btTm")
    private BtTm bttm;

    @JsonProperty("blgTm")
    private BlgTm blgtm;

    public Inngsdetail getInngsdetail ()
    {
        return inngsdetail;
    }

    public void setInngsdetail (Inngsdetail inngsdetail)
    {
        this.inngsdetail = inngsdetail;
    }

    public BtTm getBttm ()
    {
        return bttm;
    }

    public void setBttm (BtTm bttm)
    {
        this.bttm = bttm;
    }

    public BlgTm getBlgtm ()
    {
        return blgtm;
    }

    public void setBlgTm (BlgTm blgtm)
    {
        this.blgtm = blgtm;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [inngsdetail = "+inngsdetail+", bttm = "+bttm+", blgtm = "+blgtm+"]";
    }
}