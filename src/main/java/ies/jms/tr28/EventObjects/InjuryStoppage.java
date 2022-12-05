package ies.jms.tr28.EventObjects;

public class InjuryStoppage
{
    private boolean in_chain;

    public boolean isIn_chain()
    {
        return in_chain;
    }

    public void setIn_chain(boolean in_chain)
    {
        this.in_chain = in_chain;
    }

    @Override
    public String toString()
    {
        return "InjuryStoppage{" +
                "in_chain=" + in_chain +
                '}';
    }
}
