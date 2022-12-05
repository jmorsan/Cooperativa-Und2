package ies.jms.tr28.EventObjects;

public class Substitution
{
    private Replacement replacement;
    private Outcome outcome;

    public Replacement getReplacement()
    {
        return replacement;
    }

    public void setReplacement(Replacement replacement)
    {
        this.replacement = replacement;
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
        return "Substitution{" +
                "replacement=" + replacement +
                ", outcome=" + outcome +
                '}';
    }
}
