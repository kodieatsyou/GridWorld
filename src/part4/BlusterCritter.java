package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class BlusterCritter extends Critter {
	
	public int courage;
	public BlusterCritter(int c) {
		setColor(Color.RED);
		courage = c;
	}
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> Actors = new ArrayList<Actor>();
		ArrayList<Location> Locations = new ArrayList<Location>();
		for(int row = -2; row <= 2; row++) {
			for(int col = -2; col <= 2; col++) {
				Locations.add(new Location(getLocation().getRow() + row, getLocation().getCol() + col));
			}
		}
		for(Location loc : Locations) {
			if(getGrid().isValid(loc)) {
				if(getGrid().get(loc) != null){
					Actors.add(getGrid().get(loc));
				}
			}
		}
		return Actors;
	}
	
	public void processActors(ArrayList<Actor> actors) {
	int n = actors.size();
		if (n < courage) {
			setColor(getColor().brighter());
			return;
		} else if (n >= courage) {
			setColor(getColor().darker());
			return;
		} else {
			int r = (int) (Math.random() * n);
			Actor other = actors.get(r);
			setColor(other.getColor());
		}
	}
	
}