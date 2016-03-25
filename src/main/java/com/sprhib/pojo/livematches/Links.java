package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links
{
    @JsonProperty("fUrlBase")
    private String furlbase;

    public String getFurlbase ()
    {
        return furlbase;
    }

    public void setFurlbase (String furlbase)
    {
        this.furlbase = furlbase;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [furlbase = "+furlbase+"]";
    }
}
