package ies.jms.tr28.EventObjects;

import java.util.List;

public class FreezeFrame
{
    private List<Integer> location;
    private Player player;

    private Position position;
    private boolean teammate;

    public Position getPosition()
    {
        return position;
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    public boolean isTeammate()
    {
        return teammate;
    }

    public void setTeammate(boolean teammate)
    {
        this.teammate = teammate;
    }

    public List<Integer> getLocation()
    {
        return location;
    }

    public void setLocation(List<Integer> location)
    {
        this.location = location;
    }

    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }
}
