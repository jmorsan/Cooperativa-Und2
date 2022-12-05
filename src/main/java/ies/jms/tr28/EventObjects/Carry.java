package ies.jms.tr28.EventObjects;

import java.util.List;

public class Carry
{
    private List<Integer> end_location;

    public List<Integer> getEnd_location()
    {
        return end_location;
    }

    public void setEnd_location(List<Integer> end_location)
    {
        this.end_location = end_location;
    }

    @Override
    public String toString()
    {
        return "Carry{" +
                "end_location=" + end_location +
                '}';
    }
}
