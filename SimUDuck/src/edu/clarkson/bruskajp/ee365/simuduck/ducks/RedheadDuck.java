package edu.clarkson.bruskajp.ee365.simuduck.ducks;

public class RedheadDuck extends Duck implements Flyable, Quackable{
	
	@Override
	public void display(){
		System.out.println("I am a Redhead Duck!");
	}
	
	public void fly(){
		System.out.println("I am flying!");
		this.setFlying(true);
	}
	
	public void quack(){
		System.out.println("QUAAAACK!");
	}
	
}
