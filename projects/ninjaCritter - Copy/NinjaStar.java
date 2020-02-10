import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

public class NinjaStar extends Flower
{

    public NinjaStar(int dir)
    {
        setColor(null);
        setDirection(dir);
    }


    public void act()
    {
		if (canMove())
			move();
		else
			remove();
    }

    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next)){
			removeSelfFromGrid();
            return false;
		}
        Actor neighbor = gr.get(next);
        return (neighbor == null);
	}

	public void move()
	{
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
	}

	public void remove()
	{
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            removeSelfFromGrid();
        Actor neighbor = gr.get(next);
        if (neighbor instanceof Rock)
        	removeSelfFromGrid();
        else{
			removeSelfFromGrid();
			neighbor.removeSelfFromGrid();
		}

	}

}
