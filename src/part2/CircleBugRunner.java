package part2;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class CircleBugRunner {
	
	public static void main(String[] args) {
		int [] dancingbugTurns = {1,2,1,2,1,3,1,2,1,5};
		ActorWorld world = new ActorWorld();
		CircleBug alice = new CircleBug(6);
		SpiralBug jimmy = new SpiralBug(6);
		ZBug bobby = new ZBug(6);
		DancingBug bill = new DancingBug(6, dancingbugTurns);
		alice.setColor(Color.ORANGE);
		jimmy.setColor(Color.ORANGE);
		bobby.setColor(Color.ORANGE);
		bill.setColor(Color.PINK);
		CircleBug bob = new CircleBug(3);
		world.add(new Location(7, 8), alice);
		world.add(new Location(5, 5), bob);
		world.add(new Location(5, 4), jimmy);
		world.add(new Location(2, 4), bobby);
		world.add(new Location(6, 6), bill);
		world.show();
	}
}