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
	
	public void swim(){
		System.out.println("WADDLE WADDLE!");
	}
	
}
