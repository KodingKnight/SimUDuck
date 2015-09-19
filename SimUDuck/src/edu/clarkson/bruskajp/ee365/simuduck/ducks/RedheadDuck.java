package edu.clarkson.bruskajp.ee365.simuduck.ducks;

import edu.clarkson.bruskajp.ee365.simuduck.ducks.flying.FlyWithWings;
import edu.clarkson.bruskajp.ee365.simuduck.ducks.quacking.Quack;

public class RedheadDuck extends Duck{
	
	public RedheadDuck() {
		super();
		quackBehavior =  new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display(){
		System.out.println("I'm a Redhead Duck!");
	}

}
