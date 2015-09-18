package edu.clarkson.bruskajp.ee365.simuduck.ducks;

public abstract class Duck {
	
	private boolean duckPostFlight = false;
	
	public abstract void display();
	
	public void quack(){
		System.out.println("QUAAAACK!");
	}
	public void swim(){
		System.out.println("WADDLE WADDLE!");
	}
	
	public void fly() {
		System.out.println("I am flying!");
		duckPostFlight = true;
	}
	
	public boolean isFlying() {
		return duckPostFlight;
	}
	
}
