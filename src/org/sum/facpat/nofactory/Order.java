package org.sum.facpat.nofactory;

public class Order {

	public Pizza orderPizza(String type) throws Exception{
		
		Pizza pizza = null;
		
		if ("cheese".equals(type))
			pizza = new CheesePizza();
		else if ("greek".equals(type))
			pizza = new GreekPizza();
		else if ("pepperon".equals(type))
			pizza = new PepperonPizza();
		else if ("clam".equals(type))
			pizza = new ClamPizza();
		else
			throw new Exception("Unkown pizza type.");
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
