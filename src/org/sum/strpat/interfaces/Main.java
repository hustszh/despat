package org.sum.strpat.interfaces;

public class Main {

	public static void main(String[] args) {
		RedheadDuck d1 = new RedheadDuck();
		d1.swim();
		d1.quack();
		d1.fly();
		d1.display();
		
		MallardDuck d2 = new MallardDuck();
		d2.swim();
		d2.quack();
		d2.fly();
		d2.display();
		
		RubberDuck d3 = new RubberDuck();
		d3.swim();
		d3.quack();
		//d3.fly(); //Error
		d3.display();
		
		DecoyDuck d4 = new DecoyDuck();
		d4.swim();
		d4.quack();
		d4.fly(); 
		d4.display();

	}

}
