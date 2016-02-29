package part4;

import java.util.ArrayList;

import info.gridworld.grid.Location;

public class QuickCrab extends CrabCritter{
	
	public Location selectMoveLocation(ArrayList<Location> locs) {
		int n = locs.size();
		if (n == 0)
		return getLocation();
		int r = (int) (Math.random() * n);
		int direction = getLocation().getDirectionToward(locs.get(r));
		Location farLocation = locs.get(r).getAdjacentLocation(direction);
		if (getGrid().isValid(farLocation)) {
			if (getGrid().get(farLocation) == null) {
				return farLocation;
			}
		}
		return locs.get(r);
		
	}

}
