package edu.clarkson.bruskajp.ee365.simuduck.ducks.flying;

import edu.clarkson.bruskajp.ee365.simuduck.ducks.Duck;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly(Duck duck) {
		System.out.println("I am flying!");
		duck.setFlying(true);
	}
	
}
