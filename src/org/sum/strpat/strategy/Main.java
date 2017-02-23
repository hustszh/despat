package org.sum.strpat.strategy;

public class Main {

	public static void main(String[] args) {
		Duck d1 = new RedheadDuck();
		d1.swim();
		d1.performQuack();
		d1.performFly();
		d1.display();
		
		Duck d2 = new MallardDuck();
		d2.swim();
		d2.performQuack();
		d2.performFly();
		d2.display();
		
		Duck d3 = new RubberDuck();
		d3.swim();
		d3.performQuack();
		d3.performFly();
		d3.display();
		
		Duck d4 = new DecoyDuck();
		d4.swim();
		d4.performQuack();
		d4.performFly();
		d4.display();
		
		Duck d5 = new ModelDuck();
		d5.swim();
		d5.performQuack();
		d5.performFly();
		d5.display();
		d5.setFlyBehavior(new FlyRocketPowered());
		d5.performFly();
		d5.display();

	}

}
