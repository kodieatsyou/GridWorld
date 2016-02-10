package part2;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug{
	
	private int steps;
	private int sideLength;
	private int [] turns= new int [10];
	
	public DancingBug(int length, int [] turn) {
		steps = 0;
		sideLength = length;
		turns = turn;
	}
	
	public void act() {
			for (int d = 0; d < turns.length; d++) {
				if (steps < sideLength && canMove()) {
					move();
					steps++;
				} else {
					dTurn(turns[d]);
					steps = 0;
				}
			}
	}
	
	public void dTurn(int degree) {
		for (int x = 0; x < degree; x++) {
			turn();
		}
	}

}