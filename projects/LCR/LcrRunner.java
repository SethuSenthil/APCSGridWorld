import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class LcrRunner
{
    public static void main(String[] args)
    {

        ActorWorld world = new ActorWorld();
        Lcr alice = new Lcr();
        world.add(new Location(9, 4), alice);
        world.show();
    }
}

