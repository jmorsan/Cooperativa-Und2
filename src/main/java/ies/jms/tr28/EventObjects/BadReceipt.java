package ies.jms.tr28.EventObjects;

public class BadReceipt
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
        return "BadReceipt{" +
                "outcome=" + outcome +
                '}';
    }
}
