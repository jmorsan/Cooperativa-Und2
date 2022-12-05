package ies.jms.tr28.EventObjects;

public class Clearance
{
    private boolean aerial_won;
    private BodyPart body_part;

    private boolean right_foot;
    private boolean left_foot;

    private boolean head;

    public boolean isLeft_foot()
    {
        return left_foot;
    }

    public void setLeft_foot(boolean left_foot)
    {
        this.left_foot = left_foot;
    }

    public boolean isHead()
    {
        return head;
    }

    public void setHead(boolean head)
    {
        this.head = head;
    }

    public boolean isRight_foot()
    {
        return right_foot;
    }

    public void setRight_foot(boolean right_foot)
    {
        this.right_foot = right_foot;
    }

    public boolean isAerial_won()
    {
        return aerial_won;
    }

    public void setAerial_won(boolean aerial_won)
    {
        this.aerial_won = aerial_won;
    }

    public BodyPart getBody_part()
    {
        return body_part;
    }

    public void setBody_part(BodyPart body_part)
    {
        this.body_part = body_part;
    }

    @Override
    public String toString()
    {
        return "Clearance{" +
                "aerial_won=" + aerial_won +
                ", body_part=" + body_part +
                '}';
    }
}
