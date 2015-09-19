package edu.clarkson.bruskajp.ee365.simuduck.ducks;

import edu.clarkson.bruskajp.ee365.simuduck.ducks.flying.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
	
	public void fly(){
		System.out.println("I'm flying with a rocket");
	}
	
}
