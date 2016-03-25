package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mchdata
{
    @JsonProperty("NMchs")
    private String nmchs;

    private Links links;

    private Match[] match;

    public String getNmchs ()
    {
        return nmchs;
    }

    public void setNmchs (String nmchs)
    {
        this.nmchs = nmchs;
    }

    public Links getLinks ()
    {
        return links;
    }

    public void setLinks (Links links)
    {
        this.links = links;
    }

    public Match[] getMatch ()
    {
        return match;
    }

    public void setMatch (Match[] match)
    {
        this.match = match;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nmchs = "+nmchs+", links = "+links+", match = "+match+"]";
    }
}
