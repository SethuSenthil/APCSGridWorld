import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class ColorChangeBugRunner
{
    public static void main(String[] args)
    {

        ActorWorld world = new ActorWorld();
        ColorChangeBug alice = new ColorChangeBug();
        world.add(new Location(5, 5), alice);
        world.show();
    }
}

