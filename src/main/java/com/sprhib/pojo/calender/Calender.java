package com.sprhib.pojo.calender;

public class Calender
{
    private Sch sch;

    public Sch getSch ()
    {
        return sch;
    }

    public void setSch (Sch sch)
    {
        this.sch = sch;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sch = "+sch+"]";
    }
}
