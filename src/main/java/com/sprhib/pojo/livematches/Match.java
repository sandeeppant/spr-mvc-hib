package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match
{
    private String vcountry;

    @JsonProperty("Tm")
    private Tm[] tm;

    @JsonProperty("Tme")
    private Tme tme;

    private State state;

    private String srs;

    private String mnum;

    @JsonProperty("inngCnt")
    private String inngcnt;

    private String type;

    private Mscr mscr;

    private String id;

    private String vcity;

    @JsonProperty("mchDesc")
    private String mchdesc;

    private String grnd;

    private String datapath;

    public String getVcountry ()
    {
        return vcountry;
    }

    public void setVcountry (String vcountry)
    {
        this.vcountry = vcountry;
    }

    public Tm[] getTm ()
    {
        return tm;
    }

    public void setTm (Tm[] tm)
    {
        this.tm = tm;
    }

    public Tme getTme ()
    {
        return tme;
    }

    public void setTme (Tme tme)
    {
        this.tme = tme;
    }

    public State getState ()
    {
        return state;
    }

    public void setState (State state)
    {
        this.state = state;
    }

    public String getSrs ()
    {
        return srs;
    }

    public void setSrs (String srs)
    {
        this.srs = srs;
    }

    public String getMnum ()
    {
        return mnum;
    }

    public void setMnum (String mnum)
    {
        this.mnum = mnum;
    }

    public String getInngcnt ()
    {
        return inngcnt;
    }

    public void setInngCnt (String inngcnt)
    {
        this.inngcnt = inngcnt;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public Mscr getMscr ()
    {
        return mscr;
    }

    public void setMscr (Mscr mscr)
    {
        this.mscr = mscr;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getVcity ()
    {
        return vcity;
    }

    public void setVcity (String vcity)
    {
        this.vcity = vcity;
    }

    public String getMchdesc ()
    {
        return mchdesc;
    }

    public void setMchDesc (String mchdesc)
    {
        this.mchdesc = mchdesc;
    }

    public String getGrnd ()
    {
        return grnd;
    }

    public void setGrnd (String grnd)
    {
        this.grnd = grnd;
    }

    public String getDatapath ()
    {
        return datapath;
    }

    public void setDatapath (String datapath)
    {
        this.datapath = datapath;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [vcountry = "+vcountry+", Tm = "+tm+", Tme = "+tme+", state = "+state+", srs = "+srs+", mnum = "+mnum+", inngCnt = "+inngcnt+", type = "+type+", mscr = "+mscr+", id = "+id+", vcity = "+vcity+", mchdesc = "+mchdesc+", grnd = "+grnd+", datapath = "+datapath+"]";
    }
}