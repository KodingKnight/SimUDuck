package edu.clarkson.bruskajp.ee365.simuduck.ducks;

public abstract class Duck {
	
	private boolean flying = false;
	
	public boolean isFlying() {
		return flying;
	}
	
	public void setFlying(boolean flying) {
		this.flying = flying;
	}

	public abstract void display();
	
	public void quack(){
		System.out.println("QUAAAACK!");
	}
	public void swim(){
		System.out.println("WADDLE WADDLE!");
	}
	
	public void fly(){
		System.out.println("I am flying!");
		this.setFlying(true);
	}
	
}
