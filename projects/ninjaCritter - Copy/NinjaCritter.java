
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;



public class NinjaCritter extends Critter
{
    public NinjaCritter()
    {
        setColor(Color.RED);
    }

    public void act()
    {
		super.act();
		int ran = (int)(Math.random()*10);
		if (ran == 0)
			throwStar();
	}

    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (!(a instanceof Rock) && !(a instanceof Critter) && !(a instanceof NinjaStar))
                a.removeSelfFromGrid();
        }
    }

	public void throwStar()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next)&&gr.get(next)==null)
		{
			NinjaStar star = new NinjaStar(getDirection());
			star.putSelfInGrid(gr,next);
		}
	}

}
