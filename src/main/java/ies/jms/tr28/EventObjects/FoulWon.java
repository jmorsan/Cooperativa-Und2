package ies.jms.tr28.EventObjects;

public class FoulWon
{
    private boolean defensive;
    private boolean advantage;
    private boolean penalty;

    public boolean isDefensive()
    {
        return defensive;
    }

    public void setDefensive(boolean defensive)
    {
        this.defensive = defensive;
    }

    public boolean isAdvantage()
    {
        return advantage;
    }

    public void setAdvantage(boolean advantage)
    {
        this.advantage = advantage;
    }

    public boolean isPenalty()
    {
        return penalty;
    }

    public void setPenalty(boolean penalty)
    {
        this.penalty = penalty;
    }

    @Override
    public String toString()
    {
        return "FoulWon{" +
                "defensive=" + defensive +
                ", advantage=" + advantage +
                ", penalty=" + penalty +
                '}';
    }
}
