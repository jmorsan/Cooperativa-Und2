package ies.jms.tr28.EventObjects;

public class PlayerOff
{
    private boolean permanent;

    public boolean isPermanent()
    {
        return permanent;
    }

    public void setPermanent(boolean permanent)
    {
        this.permanent = permanent;
    }

    @Override
    public String toString()
    {
        return "PlayerOff{" +
                "permanent=" + permanent +
                '}';
    }
}
