package ies.jms.tr28.EventObjects;

public class Pressure
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
        return "Pressure{" +
                "counterpress=" + counterpress +
                '}';
    }
}
