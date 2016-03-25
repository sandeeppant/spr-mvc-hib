package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class State
{
    @JsonProperty("mchState")
    private String mchstate;

    private String status;
    
    @JsonProperty("TW")
    private String tw;
    
    private String decisn;

    public String getMchstate ()
    {
        return mchstate;
    }

    public void setMchstate (String mchstate)
    {
        this.mchstate = mchstate;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getTw()
    {
        return tw;
    }

    public void setTw(String tw)
    {
        this.tw = tw;
    }

    public String getDecisn()
    {
        return decisn;
    }

    public void setDecisn(String decisn)
    {
        this.decisn = decisn;
    }
    
    @Override
    public String toString()
    {
        return "ClassPojo [mchstate = "+mchstate+", status = "+status+"]";
    }
}