package edu.clarkson.bruskajp.ee365.simuduck.ducks;

public abstract class Duck {
	
	public void quack(){
		System.out.println("QUAAAACK!");
	}
	public void swim(){
		System.out.println("WADDLE WADDLE!");
	}
	public abstract void display();
	// OTHER duck-like methods...
	
}
