package ies.jms.tr28.EventObjects;

public class LineUp
{
    private Player player;
    private Position position;
    private int jersey_number;

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

    public int getJersey_number()
    {
        return jersey_number;
    }

    public void setJersey_number(int jersey_number)
    {
        this.jersey_number = jersey_number;
    }
}
