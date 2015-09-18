package edu.clarkson.bruskajp.ee365.simuduck.ducks;

public class DuckTester {
	
	public void runTheTest(){
		Duck mallardDuck = new MallardDuck();
		//mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.display();
		
		System.out.println("");
		
		Duck redheadDuck = new RedheadDuck();
		//redheadDuck.quack();
		redheadDuck.swim();
		redheadDuck.display();
	}
	
}
