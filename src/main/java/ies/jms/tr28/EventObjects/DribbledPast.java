package ies.jms.tr28.EventObjects;

public class DribbledPast
{
    private boolean counterpress;

    public boolean isCounterpress()
    {
        return counterpress;
    }

    public void setCounterpress(boolean counterpress)
    {
        this.counterpress = counterpress;
    }

    @Override
    public String toString()
    {
        return "DribbledPast{" +
                "counterpress=" + counterpress +
                '}';
    }
}
