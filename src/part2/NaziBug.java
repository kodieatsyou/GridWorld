package part2;

import info.gridworld.actor.Bug;

public class NaziBug extends Bug{
	
	private int steps;
	private int sideLength;
	private boolean isDone = false;
	
	public NaziBug(int length) {
		steps = 0;
		sideLength = length;
	}
	
	public void act() {
		if (!isDone) {
			turn();
			for (int a = 0; a < 4; a++) {
				arm();
			}
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
	
	public void turn180(){ 
		turn();
		turn();
		turn();
		turn();
	}
	
	public void arm() {;
		nMove();
		turn90();
		nMove();
		turn180();
		nMove();
		turn();
		turn();
		turn();
		turn();
		turn();
		turn();
		nMove();
		turn();
		turn();
	}
}