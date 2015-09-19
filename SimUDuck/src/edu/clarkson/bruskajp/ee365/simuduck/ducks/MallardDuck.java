package edu.clarkson.bruskajp.ee365.simuduck.ducks;

import edu.clarkson.bruskajp.ee365.simuduck.ducks.flying.FlyWithWings;
import edu.clarkson.bruskajp.ee365.simuduck.ducks.quacking.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super();
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a Mallard Duck!");
	}
	
}
