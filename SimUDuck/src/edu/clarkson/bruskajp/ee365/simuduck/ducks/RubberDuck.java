package edu.clarkson.bruskajp.ee365.simuduck.ducks;

import edu.clarkson.bruskajp.ee365.simuduck.ducks.flying.FlyNoWay;
import edu.clarkson.bruskajp.ee365.simuduck.ducks.quacking.Squeak;

public class RubberDuck extends Duck{

	public RubberDuck() {
		super();
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am a Rubber Duck");
	}

}
