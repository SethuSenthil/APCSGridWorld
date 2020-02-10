
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;



public class DarthMaul extends Critter
{
    public DarthMaul()
    {
        setColor(Color.RED);
    }

    public void act()
    {
		super.act();
				   Location left = loc.getAdjacentLocation(Location.LEFT);
					left.removeSelfFromGrid();
					   Location right = loc.getAdjacentLocation(Location.LEFT);
					right.removeSelfFromGrid();

	}

    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (!(a instanceof Rock) && !(a instanceof Critter) && !(a instanceof NinjaStar))
                a.removeSelfFromGrid();
        }
    }


}
