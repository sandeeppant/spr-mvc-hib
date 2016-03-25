package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlgTm
{
    private String id;

    @JsonProperty("Inngs")
    private Inngs inngs;

    @JsonProperty("sName")
    private String sname;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Inngs getInngs ()
    {
        return inngs;
    }

    public void setInngs (Inngs inngs)
    {
        this.inngs = inngs;
    }

    public String getSname ()
    {
        return sname;
    }

    public void setSname (String sname)
    {
        this.sname = sname;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", inngs = "+inngs+", sname = "+sname+"]";
    }
}
