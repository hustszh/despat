package org.sum.strpat.extend;

public class Main {

	public static void main(String[] args) {
		Duck d1 = new RedheadDuck();
		d1.swim();
		d1.quack();
		d1.fly();
		d1.display();
		
		Duck d2 = new MallardDuck();
		d2.swim();
		d2.quack();
		d2.fly();
		d2.display();
		
		Duck d3 = new RubberDuck();
		d3.swim();
		d3.quack();
		d3.fly();
		d3.display();
		
		Duck d4 = new DecoyDuck();
		d4.swim();
		d4.quack();
		d4.fly();
		d4.display();

	}

}
