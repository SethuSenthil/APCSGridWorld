import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;


public class Lcr extends Actor
{

    public Lcr()
    {
		setColor(null);


    }

    public Lcr(Color bugColor)
    {
		setColor(bugColor);
    }

    public void act()
    {
        if (canMove())
            move();
        else
            turn();
    }

    public void turn()
    {
        setDirection(getDirection() + Location.HALF_RIGHT);
    }

    public void move()
    {
		Grid<Actor> gr = getGrid();

		int ranNum = (int) (Math.random() * 100);
		System.out.println(ranNum);

		if(ranNum >= 50){
			 Location loc = getLocation();
		        Location next = loc.getAdjacentLocation(getDirection());
					 moveTo(next);
		}else{
			int ranNumm = (int) (Math.random() * 100);


			if(ranNumm >= 50){
		      Location loc = getLocation();
		      setDirection(Location.RIGHT);
			  Location next = loc.getAdjacentLocation(getDirection());
					 moveTo(next);

			}else{
                 Location loc = getLocation();
						      setDirection(Location.LEFT);
				Location next = loc.getAdjacentLocation(getDirection());
					 moveTo(next);
			}



		}


    }

    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();

	  Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next)){

		   Location def = new Location(9,4);
			moveTo(def);
            return false;


		}
          /*
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Rainbow);
*/
		return true;
    }
}

