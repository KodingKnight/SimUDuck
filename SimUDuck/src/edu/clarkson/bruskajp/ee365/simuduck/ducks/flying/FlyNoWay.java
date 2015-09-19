package edu.clarkson.bruskajp.ee365.simuduck.ducks.flying;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
