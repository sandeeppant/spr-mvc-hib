package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inngs
{
    private String ovrs;

    private String desc;

    @JsonProperty("FollowOn")
    private String followon;

    private String r;

    @JsonProperty("Decl")
    private String decl;

    private String wkts;

    public String getOvrs ()
    {
        return ovrs;
    }

    public void setOvrs (String ovrs)
    {
        this.ovrs = ovrs;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public String getFollowon ()
    {
        return followon;
    }

    public void setFollowon (String followon)
    {
        this.followon = followon;
    }

    public String getR ()
    {
        return r;
    }

    public void setR (String r)
    {
        this.r = r;
    }

    public String getDecl ()
    {
        return decl;
    }

    public void setDecl (String decl)
    {
        this.decl = decl;
    }

    public String getWkts ()
    {
        return wkts;
    }

    public void setWkts (String wkts)
    {
        this.wkts = wkts;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ovrs = "+ovrs+", desc = "+desc+", followon = "+followon+", r = "+r+", decl = "+decl+", wkts = "+wkts+"]";
    }
}
