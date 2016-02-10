package part2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug{
	
	private int steps;
	private int sideLength;
	private boolean isDone = false;
	
	public ZBug(int length) {
		steps = 0;
		sideLength = length;
	}
	
	public void act() {
		if (!isDone) {
			turn();
			turn();
			zMove();
			turn135();
			zMove();
			turn135();
			turn();
			turn();
			zMove();
			isDone = true;
		}
	}
	
	public void zMove() {
		for (int v = 0; v < sideLength; v++) {
			move();
		}
	}
	public void turn135() {
		turn();
		turn();
		turn();
	}

}