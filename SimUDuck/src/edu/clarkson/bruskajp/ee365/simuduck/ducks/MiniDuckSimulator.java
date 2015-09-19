package edu.clarkson.bruskajp.ee365.simuduck.ducks;

public class MiniDuckSimulator {
	
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	
}
