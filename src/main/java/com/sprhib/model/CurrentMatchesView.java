package com.sprhib.model;

public class CurrentMatchesView
{

    private Integer id;

    private String de;

    private String si;
    
    public CurrentMatchesView()
    {
        super();
    }

    public CurrentMatchesView(Integer id, String de, String si)
    {
        super();
        this.id = id;
        this.de = de;
        this.si = si;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getDe()
    {
        return de;
    }

    public void setDe(String de)
    {
        this.de = de;
    }

    public String getSi()
    {
        return si;
    }

    public void setSi(String si)
    {
        this.si = si;
    }
    
}
