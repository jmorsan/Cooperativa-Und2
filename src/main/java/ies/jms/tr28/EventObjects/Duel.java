package ies.jms.tr28.EventObjects;

public class Duel
{
    private boolean counterpress;
    private Type type;
    private Outcome outcome;

    public boolean isCounterpress()
    {
        return counterpress;
    }

    public void setCounterpress(boolean counterpress)
    {
        this.counterpress = counterpress;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }

    public Outcome getOutcome()
    {
        return outcome;
    }

    public void setOutcome(Outcome outcome)
    {
        this.outcome = outcome;
    }

    @Override
    public String toString()
    {
        return "Duel{" +
                "counterpress=" + counterpress +
                ", type=" + type +
                ", outcome=" + outcome +
                '}';
    }
}
