package org.sum.facpat.simplefactory;

public class Order {

	public Pizza orderPizza(String type) throws Exception{
		
		PizzaSimpleFactory psf = new PizzaSimpleFactory();
		
		Pizza pizza = psf.makePizza(type);	
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
