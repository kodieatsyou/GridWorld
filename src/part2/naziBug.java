package part2;

import info.gridworld.actor.Bug;

public class naziBug extends Bug{
	
	private int steps;
	private int sideLength;
	private boolean isDone = false;
	
	public naziBug(int length) {
		steps = 0;
		sideLength = length;
	}
	
	public void act() {
		if (!isDone) {
			turn();
			nMove();
			turn360();
			nMove();
			turn90();
			nMove();
			turn90();
			nMove();
			turn90();
			nMove();
			turn360();
			nMove();
			isDone = true;
		}
	}
	
	public void nMove() {
		for (int v = 0; v < sideLength; v++) {
			move();
		}
	}
	public void turn90() {
		turn();
		turn();
	}
	public void turn360() {
		turn();
		turn();
		turn();
		turn();
		turn();
		turn();
		turn();
		turn();
	}

}