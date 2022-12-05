package ies.jms.tr28.EventObjects;

public class Fiftyfifty
{
    private Outcome outcome;
    private boolean counterpress;

    public Outcome getOutcome()
    {
        return outcome;
    }

    public void setOutcome(Outcome outcome)
    {
        this.outcome = outcome;
    }

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
        return "Fiftyfifty{" +
                "outcome=" + outcome +
                ", counterpress=" + counterpress +
                '}';
    }
}
