package edu.clarkson.bruskajp.ee365.simuduck.ducks;

public class RubberDuck extends Duck implements Quackable{

	@Override
	public void display() {
		System.out.println("I am a Rubber Duck");
	}
	
	public void quack(){
		System.out.println("Squeeeek");
	}

}
