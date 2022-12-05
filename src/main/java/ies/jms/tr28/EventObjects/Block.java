package ies.jms.tr28.EventObjects;

public class Block
{
    private boolean offensive;
    private boolean deflection;
    private boolean save_block;
    private boolean counterpress;

    public boolean isOffensive()
    {
        return offensive;
    }

    public void setOffensive(boolean offensive)
    {
        this.offensive = offensive;
    }

    public boolean isDeflection()
    {
        return deflection;
    }

    public void setDeflection(boolean deflection)
    {
        this.deflection = deflection;
    }

    public boolean isSave_block()
    {
        return save_block;
    }

    public void setSave_block(boolean save_block)
    {
        this.save_block = save_block;
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
        return "Block{" +
                "offensive=" + offensive +
                ", deflection=" + deflection +
                ", save_block=" + save_block +
                ", counterpress=" + counterpress +
                '}';
    }
}
