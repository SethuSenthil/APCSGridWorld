
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


		try{

			//remove left
	           Grid<Actor> gr = getGrid();
                   Location loc = getLocation();
                   Location left = loc.getAdjacentLocation(Location.LEFT);
   		        Actor leftActor = gr.get(left);
   		        leftActor.removeSelfFromGrid();

               //remove left
   				Location right = loc.getAdjacentLocation(Location.RIGHT);
   				Actor rightActor = gr.get(right);
   		        rightActor.removeSelfFromGrid();
	   }finally{
          //if the grid loc is not valid/ out of the world
	   }



	}

    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
                a.removeSelfFromGrid();
        }
    }

     public Location selectMoveLocation(ArrayList<Location> locs)
       {
           int n = locs.size();
           if (n == 0)
               return getLocation();
           int r = (int) (Math.random() * n);
                   Location loc = getLocation();


           //set dir to new loc
           int turnTo = loc.getDirectionToward(locs.get(r));
           setDirection(turnTo);
           //


           return locs.get(r);
    }


}
