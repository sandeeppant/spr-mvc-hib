package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BtTm
{
    private String id;
    
    @JsonProperty("sName")
    private String sname;
    
    @JsonProperty("Inngs")
    private Inngs inngs;

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

    public void setSName (String sname)
    {
        this.sname = sname;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", inngs = "+inngs+", sname = "+sname+"]";
    }
}
