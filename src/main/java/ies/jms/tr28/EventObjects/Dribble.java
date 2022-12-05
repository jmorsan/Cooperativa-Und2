package ies.jms.tr28.EventObjects;

public class Dribble
{
    private boolean overrun;
    private boolean nutmeg;
    private Outcome outcome;
    private boolean no_touch;

    public boolean isOverrun()
    {
        return overrun;
    }

    public void setOverrun(boolean overrun)
    {
        this.overrun = overrun;
    }

    public boolean isNutmeg()
    {
        return nutmeg;
    }

    public void setNutmeg(boolean nutmeg)
    {
        this.nutmeg = nutmeg;
    }

    public Outcome getOutcome()
    {
        return outcome;
    }

    public void setOutcome(Outcome outcome)
    {
        this.outcome = outcome;
    }

    public boolean isNo_touch()
    {
        return no_touch;
    }

    public void setNo_touch(boolean no_touch)
    {
        this.no_touch = no_touch;
    }

    @Override
    public String toString()
    {
        return "Dribble{" +
                "overrun=" + overrun +
                ", nutmeg=" + nutmeg +
                ", outcome=" + outcome +
                ", no_touch=" + no_touch +
                '}';
    }
}
