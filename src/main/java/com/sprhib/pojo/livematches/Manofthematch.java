package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Manofthematch
{
    @JsonProperty("NoOfPlayers")
    private String noofplayers;

    private Mom mom;

    public String getNoofplayers ()
    {
        return noofplayers;
    }

    public void setNoofplayers (String noofplayers)
    {
        this.noofplayers = noofplayers;
    }

    public Mom getMom ()
    {
        return mom;
    }

    public void setMom (Mom mom)
    {
        this.mom = mom;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [noofplayers = "+noofplayers+", mom = "+mom+"]";
    }
}