package ies.jms.tr28.EventObjects;

public class Misscontrol
{
    private boolean aerial_won;

    public boolean isAerial_won()
    {
        return aerial_won;
    }

    public void setAerial_won(boolean aerial_won)
    {
        this.aerial_won = aerial_won;
    }

    @Override
    public String toString()
    {
        return "Misscontrol{" +
                "aerial_won=" + aerial_won +
                '}';
    }
}
