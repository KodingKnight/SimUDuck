package edu.clarkson.bruskajp.ee365.simuduck.ducks;

import edu.clarkson.bruskajp.ee365.simuduck.ducks.flying.FlyNoWay;
import edu.clarkson.bruskajp.ee365.simuduck.ducks.quacking.Quack;

public class ModelDuck extends Duck{
	
	public ModelDuck(){
		super();
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
