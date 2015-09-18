package edu.clarkson.bruskajp.ee365.simuduck.ducks;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlyingDuckTester {
	
	@Test
	public void testRubberDuck(){
		Duck duck =  new RubberDuck();
		//duck.fly();
		
		if(duck.isFlying()){
			fail("Rubber ducks can't fly!!");
		}
	}
	
}
