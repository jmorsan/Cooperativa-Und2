package ies.jms.tr28.EventObjects;

public class FoulCommitted
{
    private boolean counterpress;
    private boolean offensive;
    private Type type;
    private boolean advantage;
    private boolean penalty;
    private Card card;

    public boolean isCounterpress()
    {
        return counterpress;
    }

    public void setCounterpress(boolean counterpress)
    {
        this.counterpress = counterpress;
    }

    public boolean isOffensive()
    {
        return offensive;
    }

    public void setOffensive(boolean offensive)
    {
        this.offensive = offensive;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
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

    public Card getCard()
    {
        return card;
    }

    public void setCard(Card card)
    {
        this.card = card;
    }

    @Override
    public String toString()
    {
        return "FoulCommitted{" +
                "counterpress=" + counterpress +
                ", offensive=" + offensive +
                ", type=" + type +
                ", advantage=" + advantage +
                ", penalty=" + penalty +
                ", card=" + card +
                '}';
    }
}
