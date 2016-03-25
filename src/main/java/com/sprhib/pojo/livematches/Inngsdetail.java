package com.sprhib.pojo.livematches;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inngsdetail
{
    private String cprtshp;

    private String crr;

    private String noofovers;

    private String rrr;

    public String getCprtshp ()
    {
        return cprtshp;
    }

    public void setCprtshp (String cprtshp)
    {
        this.cprtshp = cprtshp;
    }

    public String getCrr ()
    {
        return crr;
    }

    public void setCrr (String crr)
    {
        this.crr = crr;
    }

    public String getNoofovers ()
    {
        return noofovers;
    }

    public void setNoofovers (String noofovers)
    {
        this.noofovers = noofovers;
    }

    public String getRrr ()
    {
        return rrr;
    }

    public void setRrr (String rrr)
    {
        this.rrr = rrr;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cprtshp = "+cprtshp+", crr = "+crr+", noofovers = "+noofovers+", rrr = "+rrr+"]";
    }
}