package ies.jms.tr28.EventObjects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Pass
{
    private Recipient recipient;
    private double length;
    private double angle;
    private Height height;
    private List<Integer> end_location;
    private String assisted_shot_id;
    private boolean backheel;
    private boolean deflected;
    private boolean miscommunication;
    private boolean cross;
    private boolean cut_back;
    private boolean shot_assist;
    private boolean goal_assist;
    private BodyPart body_part;
    private boolean through_ball;
    @JsonProperty("switch")
    private Boolean switchParam;
    private Type type;
    private Outcome outcome;
    private Technique technique;
    private boolean outswinging;
    private boolean aerial_won;

    private boolean no_touch;

    private boolean inswinging;

    private FoulCommitted foul_committed;

    public FoulCommitted getFoul_committed()
    {
        return foul_committed;
    }

    public void setFoul_committed(FoulCommitted foul_committed)
    {
        this.foul_committed = foul_committed;
    }

    public boolean isInswinging()
    {
        return inswinging;
    }

    public void setInswinging(boolean inswinging)
    {
        this.inswinging = inswinging;
    }

    public boolean isNo_touch()
    {
        return no_touch;
    }

    public void setNo_touch(boolean no_touch)
    {
        this.no_touch = no_touch;
    }

    public boolean isAerial_won()
    {
        return aerial_won;
    }

    public void setAerial_won(boolean aerial_won)
    {
        this.aerial_won = aerial_won;
    }

    public boolean isOutswinging()
    {
        return outswinging;
    }

    public void setOutswinging(boolean outswinging)
    {
        this.outswinging = outswinging;
    }

    public boolean isThrough_ball()
    {
        return through_ball;
    }

    public void setThrough_ball(boolean through_ball)
    {
        this.through_ball = through_ball;
    }



    public Recipient getRecipient()
    {
        return recipient;
    }

    public void setRecipient(Recipient recipient)
    {
        this.recipient = recipient;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getAngle()
    {
        return angle;
    }

    public void setAngle(double angle)
    {
        this.angle = angle;
    }

    public Height getHeight()
    {
        return height;
    }

    public void setHeight(Height height)
    {
        this.height = height;
    }

    public List<Integer> getEnd_location()
    {
        return end_location;
    }

    public void setEnd_location(List<Integer> end_location)
    {
        this.end_location = end_location;
    }

    public String getAssisted_shot_id()
    {
        return assisted_shot_id;
    }

    public void setAssisted_shot_id(String assisted_shot_id)
    {
        this.assisted_shot_id = assisted_shot_id;
    }

    public boolean isBackheel()
    {
        return backheel;
    }

    public void setBackheel(boolean backheel)
    {
        this.backheel = backheel;
    }

    public boolean isDeflected()
    {
        return deflected;
    }

    public void setDeflected(boolean deflected)
    {
        this.deflected = deflected;
    }

    public boolean isMiscommunication()
    {
        return miscommunication;
    }

    public void setMiscommunication(boolean miscommunication)
    {
        this.miscommunication = miscommunication;
    }

    public boolean isCross()
    {
        return cross;
    }

    public void setCross(boolean cross)
    {
        this.cross = cross;
    }

    public boolean isCut_back()
    {
        return cut_back;
    }

    public void setCut_back(boolean cut_back)
    {
        this.cut_back = cut_back;
    }

    public boolean isShot_assist()
    {
        return shot_assist;
    }

    public void setShot_assist(boolean shot_assist)
    {
        this.shot_assist = shot_assist;
    }

    public boolean isGoal_assist()
    {
        return goal_assist;
    }

    public void setGoal_assist(boolean goal_assist)
    {
        this.goal_assist = goal_assist;
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

    public Technique getTechnique()
    {
        return technique;
    }

    public void setTechnique(Technique technique)
    {
        this.technique = technique;
    }

    @JsonProperty("switch")
    public Boolean getSwitchParam()
    {
        return this.switchParam;
    }

    @JsonProperty("switch")
    public void setSwitchParam(Boolean switchParam)
    {
        this.switchParam = switchParam;
    }


}
