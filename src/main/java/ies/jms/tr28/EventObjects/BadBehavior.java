package ies.jms.tr28.EventObjects;

public class BadBehavior
{
    private Card card;

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
        return "BadBehavior{" +
                "card=" + card +
                '}';
    }
}
