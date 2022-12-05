package ies.jms.tr28.EventObjects;

import java.util.List;

public class Goalkeeper
{
    private Position position;
    private  Technique technique;
    private BodyPart body_part;
    private Type type;
    private Outcome outcome;

    private List<Double>end_location;

    public List<Double> getEnd_location()
    {
        return end_location;
    }

    public void setEnd_location(List<Double> end_location)
    {
        this.end_location = end_location;
    }

    public Position getPosition()
    {
        return position;
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    public Technique getTechnique()
    {
        return technique;
    }

    public void setTechnique(Technique technique)
    {
        this.technique = technique;
    }

    public BodyPart getBody_part()
    {
        return body_part;
    }

    public void setBody_part(BodyPart body_part)
    {
        this.body_part = body_part;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
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
        return "Goalkeeper{" +
                "position=" + position +
                ", technique=" + technique +
                ", body_part=" + body_part +
                ", type=" + type +
                ", outcome=" + outcome +
                '}';
    }
}
