package ies.jms.tr28.EventUtils;

import ies.jms.tr28.EventObjects.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;


public class Event
{
    private String id;
    private int index;
    private int period;
    private Date timestampDate;
    private String timestamp;
    private int minute;
    private int second;
    private Type type;
    private int possession;
    private PossessionTeam possession_team;
    private PlayPattern play_pattern;
    private boolean off_camera;
    private Team team;
    private Player player;
    private Position position;
    private List<Integer> location;
    private double duration;
    private boolean under_pressure;
    private boolean out;
    private Tactics tactics;
    private Carry carry;
    private Pass pass;
    private BallReceipt ball_receipt;
    private Interception interception;
    private boolean counterpress;
    private FoulWon foul_won;
    private Dribble dribble;
    private Duel duel;
    private Clearance clearance;
    private Shot shot;
    private Goalkeeper goalkeeper;
    private FoulCommitted foul_committed;
    private Block block;
    private BallRecovery ball_recovery;
    private Substitution substitution;
    private InjuryStoppage injury_stoppage;

    public InjuryStoppage getInjury_stoppage()
    {
        return injury_stoppage;
    }

    public void setInjury_stoppage(InjuryStoppage injury_stoppage)
    {
        this.injury_stoppage = injury_stoppage;
    }

    public Substitution getSubstitution()
    {
        return substitution;
    }

    public void setSubstitution(Substitution substitution)
    {
        this.substitution = substitution;
    }

    public BallRecovery getBall_recovery()
    {
        return ball_recovery;
    }

    public void setBall_recovery(BallRecovery ball_recovery)
    {
        this.ball_recovery = ball_recovery;
    }

    public Block getBlock()
    {
        return block;
    }

    public void setBlock(Block block)
    {
        this.block = block;
    }

    public FoulCommitted getFoul_committed()
    {
        return foul_committed;
    }

    public void setFoul_committed(FoulCommitted foul_committed)
    {
        this.foul_committed = foul_committed;
    }

    public Goalkeeper getGoalkeeper()
    {
        return goalkeeper;
    }

    public void setGoalkeeper(Goalkeeper goalkeeper)
    {
        this.goalkeeper = goalkeeper;
    }

    public Shot getShot()
    {
        return shot;
    }

    public void setShot(Shot shot)
    {
        this.shot = shot;
    }

    public Clearance getClearance()
    {
        return clearance;
    }

    public void setClearance(Clearance clearance)
    {
        this.clearance = clearance;
    }

    public Duel getDuel()
    {
        return duel;
    }

    public void setDuel(Duel duel)
    {
        this.duel = duel;
    }

    public Dribble getDribble()
    {
        return dribble;
    }

    public void setDribble(Dribble dribble)
    {
        this.dribble = dribble;
    }

    public FoulWon getFoul_won()
    {
        return foul_won;
    }

    public void setFoul_won(FoulWon foul_won)
    {
        this.foul_won = foul_won;
    }

    public boolean isCounterpress()
    {
        return counterpress;
    }

    public void setCounterpress(boolean counterpress)
    {
        this.counterpress = counterpress;
    }

    public Interception getInterception()
    {
        return interception;
    }

    public void setInterception(Interception interception)
    {
        this.interception = interception;
    }

    public BallReceipt getBall_receipt()
    {
        return ball_receipt;
    }

    public void setBall_receipt(BallReceipt ball_receipt)
    {
        this.ball_receipt = ball_receipt;
    }

    public Carry getCarry()
    {
        return carry;
    }

    public void setCarry(Carry carry)
    {
        this.carry = carry;
    }

    public Pass getPass()
    {
        return pass;
    }

    public void setPass(Pass pass)
    {
        this.pass = pass;
    }

    public boolean isUnder_pressure()
    {
        return under_pressure;
    }

    public void setUnder_pressure(boolean under_pressure)
    {
        this.under_pressure = under_pressure;
    }

    public boolean isOut()
    {
        return out;
    }

    public void setOut(boolean out)
    {
        this.out = out;
    }

    public Tactics getTactics()
    {
        return tactics;
    }

    public void setTactics(Tactics tactics)
    {
        this.tactics = tactics;
    }

    private List<UUID> related_events;
    private Fiftyfifty fiftyFifty;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public int getPeriod()
    {
        return period;
    }

    public void setPeriod(int period)
    {
        this.period = period;
    }

    public String getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(String timestamp) throws EventException
    {

        try
        {
            //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
            this.timestampDate = new SimpleDateFormat("HH:mm:ss.SSS").parse(timestamp);

        }
        catch (ParseException parseException)
        {
            parseException.printStackTrace();
            throw new EventException("No se pudo parsear la fecha  " , parseException);
        }

        this.timestamp = timestamp;
    }

    public int getMinute()
    {
        return minute;
    }

    public void setMinute(int minute)
    {
        this.minute = minute;
    }

    public int getSecond()
    {
        return second;
    }

    public void setSecond(int second)
    {
        this.second = second;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }

    public Date getTimestampDate()
    {
        return timestampDate;
    }

    public void setTimestampDate(Date timestampDate)
    {
        this.timestampDate = timestampDate;
    }

    public int getPossession()
    {
        return possession;
    }

    public void setPossession(int possession)
    {
        this.possession = possession;
    }

    public PossessionTeam getPossession_team()
    {
        return possession_team;
    }

    public void setPossession_team(PossessionTeam possession_team)
    {
        this.possession_team = possession_team;
    }

    public PlayPattern getPlay_pattern()
    {
        return play_pattern;
    }

    public void setPlay_pattern(PlayPattern play_pattern)
    {
        this.play_pattern = play_pattern;
    }

    public boolean isOff_camera()
    {
        return off_camera;
    }

    public void setOff_camera(boolean off_camera)
    {
        this.off_camera = off_camera;
    }

    public Team getTeam()
    {
        return team;
    }

    public void setTeam(Team team)
    {
        this.team = team;
    }

    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public Position getPosition()
    {
        return position;
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    public List<Integer> getLocation()
    {
        return location;
    }

    public void setLocation(List<Integer> location)
    {
        this.location = location;
    }

    public double getDuration()
    {
        return duration;
    }

    public void setDuration(double duration)
    {
        this.duration = duration;
    }

    public List<UUID> getRelated_events()
    {
        return related_events;
    }

    public void setRelated_events(List<UUID> related_events)
    {
        this.related_events = related_events;
    }

    public Fiftyfifty getFiftyFifty()
    {
        return fiftyFifty;
    }

    public void setFiftyFifty(Fiftyfifty fiftyFifty)
    {
        this.fiftyFifty = fiftyFifty;
    }

    @Override
    public String toString()
    {
        return "Event{" +
                "id='" + id + '\'' +
                ", index=" + index +
                ", period=" + period +
                ", timestampDate=" + timestampDate +
                ", timestamp='" + timestamp + '\'' +
                ", minute=" + minute +
                ", second=" + second +
                ", type=" + type +
                ", possession=" + possession +
                ", possession_team=" + possession_team +
                ", play_pattern=" + play_pattern +
                ", off_camera=" + off_camera +
                ", team=" + team +
                ", player=" + player +
                ", position=" + position +
                ", location=" + location +
                ", duration=" + duration +
                ", under_pressure=" + under_pressure +
                ", out=" + out +
                ", tactics=" + tactics +
                ", carry=" + carry +
                ", pass=" + pass +
                ", ball_receipt=" + ball_receipt +
                ", interception=" + interception +
                ", counterpress=" + counterpress +
                ", foul_won=" + foul_won +
                ", dribble=" + dribble +
                ", duel=" + duel +
                ", clearance=" + clearance +
                ", shot=" + shot +
                ", goalkeeper=" + goalkeeper +
                ", foul_committed=" + foul_committed +
                ", block=" + block +
                ", ball_recovery=" + ball_recovery +
                ", substitution=" + substitution +
                ", injury_stoppage=" + injury_stoppage +
                ", related_events=" + related_events +
                ", fiftyFifty=" + fiftyFifty +
                '}';
    }
}
