
import info.gridworld.actor.Actor;
import java.awt.Color;

public class Rainbow extends Actor
{
    private static final Color DEFAULT_COLOR = Color.PINK;
    private static final double DARKENING_FACTOR = 0.05;


    public Rainbow()
    {
        setColor(null);
    }

    public Rainbow(Color initialColor)
    {
        setColor(initialColor);
    }


    public void act()
    {

    }
}

