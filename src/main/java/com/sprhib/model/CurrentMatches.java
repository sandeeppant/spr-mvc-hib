package com.sprhib.model;

public class CurrentMatches
{

    private Integer id;

    private String t1;

    private String t2;
    
    
    public CurrentMatches()
    {
        super();
    }

    public CurrentMatches(Integer id, String t1, String t2)
    {
        super();
        this.id = id;
        this.t1 = t1;
        this.t2 = t2;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getT1()
    {
        return t1;
    }

    public void setName(String t1)
    {
        this.t1 = t1;
    }

    public String getT2()
    {
        return t2;
    }

    public void setRating(String t2)
    {
        this.t2 = t2;
    }

}
