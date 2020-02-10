
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;


public class NinjaRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        for (int i = 0; i < 5; i ++)
        	world.add(new Rock());
        for (int i = 0; i < 5; i ++)
        	world.add(new Flower());
        for (int i = 0; i < 5; i ++)
        	world.add(new Bug());

        world.add(new Location(9, 3), new NinjaCritter());
        world.add(new Location(9, 8), new NinjaCritter());
        world.show();
    }
}