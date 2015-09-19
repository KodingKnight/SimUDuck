package edu.clarkson.bruskajp.ee365.simuduck.ducks;

import edu.clarkson.bruskajp.ee365.simuduck.ducks.flying.FlyNoWay;
import edu.clarkson.bruskajp.ee365.simuduck.ducks.quacking.MuteQuack;

public class DecoyDuck extends Duck{
	
	public DecoyDuck() {
		super();
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Decoy Duck!");
	}
	
}
