package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class KingCrab extends CrabCritter{
	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors) {
			if (!(a instanceof Rock)){
				Location alocation = a.getLocation();
				a.setDirection(a.getLocation().getDirectionToward(getLocation())+Location.HALF_CIRCLE);
				Location behindALocation = alocation.getAdjacentLocation(a.getDirection());
				if (getGrid().isValid(behindALocation)) {
					if (getGrid().get(behindALocation) == null) {
						a.moveTo(behindALocation);
					}else {
						a.removeSelfFromGrid();
					}
				}else {
					a.removeSelfFromGrid();
				}
			}
		}
	}
}
