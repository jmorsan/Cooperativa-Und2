package ies.jms.tr28.EventObjects;

public class Interception
{
    private Outcome outcome;

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
        return "Interception{" +
                "outcome=" + outcome +
                '}';
    }
}
