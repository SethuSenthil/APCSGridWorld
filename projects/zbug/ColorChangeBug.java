import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import java.awt.Color;


/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ColorChangeBug extends Bug
{

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ColorChangeBug()
    {
		setDirection(Location.EAST);
    }


    /**
     * Moves to the next location of the square.
     */
    public void act()
    {


Color color[] = {Color.YELLOW,Color.RED,Color.BLUE,Color.PINK,Color.ORANGE};
		int ranIndex = (int) (Math.random() * color.length);
		super.setColor(color[ranIndex]);

  if (canMove())
	   move();
   else
	  turn();

    }

}
