package ies.jms.tr28.EventObjects;

import java.util.List;

public class Tactics
{
    private int formation;

    private List<LineUp>lineup;

    public int getFormation()
    {
        return formation;
    }

    public void setFormation(int formation)
    {
        this.formation = formation;
    }

    public List<LineUp> getLineup()
    {
        return lineup;
    }

    public void setLineup(List<LineUp> lineup)
    {
        this.lineup = lineup;
    }
}
