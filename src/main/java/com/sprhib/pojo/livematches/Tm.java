package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tm
{
    @JsonProperty("Name")
    private String name;

    private String id;

    private String flag;

    @JsonProperty("sName")
    private String sname;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getFlag ()
    {
        return flag;
    }

    public void setFlag (String flag)
    {
        this.flag = flag;
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
        return "ClassPojo [name = "+name+", id = "+id+", flag = "+flag+", sname = "+sname+"]";
    }
}