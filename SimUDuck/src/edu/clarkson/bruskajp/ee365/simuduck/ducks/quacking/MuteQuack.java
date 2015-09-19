package edu.clarkson.bruskajp.ee365.simuduck.ducks.quacking;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
