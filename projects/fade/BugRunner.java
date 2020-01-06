import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
public class BugRunner
{
public static void main(String[] args)
{
ActorWorld world = new ActorWorld();
world.add(new Bug());
world.add(new Rock());
world.show();
}
}