package ies.jms.tr28.EventObjects;

import java.util.List;

public class Shot
{
    private String key_pass_id;
    private List<Integer> end_location;
    private boolean aerial_won;
    private boolean follows_dribble;
    private boolean first_time;
    private boolean open_goal;
    private boolean deflected;
    private Technique technique;
    private Type type;
    private Outcome outcome;
    private BodyPart body_part;
    private double statsbomb_xg;
    private List<FreezeFrame> freeze_frame;
    private boolean one_on_one;

    public boolean isOne_on_one()
    {
        return one_on_one;
    }

    public void setOne_on_one(boolean one_on_one)
    {
        this.one_on_one = one_on_one;
    }

    public List<FreezeFrame> getFreeze_frame()
    {
        return freeze_frame;
    }

    public void setFreeze_frame(List<FreezeFrame> freeze_frame)
    {
        this.freeze_frame = freeze_frame;
    }

    public BodyPart getBody_part()
    {
        return body_part;
    }

    public void setBody_part(BodyPart body_part)
    {
        this.body_part = body_part;
    }

    public double getStatsbomb_xg()
    {
        return statsbomb_xg;
    }

    public void setStatsbomb_xg(double statsbomb_xg)
    {
        this.statsbomb_xg = statsbomb_xg;
    }

    public String getKey_pass_id()
    {
        return key_pass_id;
    }

    public void setKey_pass_id(String key_pass_id)
    {
        this.key_pass_id = key_pass_id;
    }

    public List<Integer> getEnd_location()
    {
        return end_location;
    }

    public void setEnd_location(List<Integer> end_location)
    {
        this.end_location = end_location;
    }

    public boolean isAerial_won()
    {
        return aerial_won;
    }

    public void setAerial_won(boolean aerial_won)
    {
        this.aerial_won = aerial_won;
    }

    public boolean isFollows_dribble()
    {
        return follows_dribble;
    }

    public void setFollows_dribble(boolean follows_dribble)
    {
        this.follows_dribble = follows_dribble;
    }

    public boolean isFirst_time()
    {
        return first_time;
    }

    public void setFirst_time(boolean first_time)
    {
        this.first_time = first_time;
    }

    public boolean isOpen_goal()
    {
        return open_goal;
    }

    public void setOpen_goal(boolean open_goal)
    {
        this.open_goal = open_goal;
    }

    public boolean isDeflected()
    {
        return deflected;
    }

    public void setDeflected(boolean deflected)
    {
        this.deflected = deflected;
    }

    public Technique getTechnique()
    {
        return technique;
    }

    public void setTechnique(Technique technique)
    {
        this.technique = technique;
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


}
