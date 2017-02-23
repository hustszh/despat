package org.sum.decpat;

public class Main {

	public static void main(String[] args) {
		Component es = new Espresso();
		System.out.println(es.getDescription() + ":" + es.cost());
		
		Component milk = new Milk(es);
		Component mocha = new Mocha(milk);
		System.out.println(mocha.getDescription() + ":" + mocha.cost());
		
		Component hb = new HouseBlend();
		Component comp = new Mocha(new Mocha(new Milk(hb)));
		System.out.println(comp.getDescription() + ":" + comp.cost());
		
	}

}
