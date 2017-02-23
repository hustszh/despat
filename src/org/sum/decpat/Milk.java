package org.sum.decpat;

public class Milk extends Decorator {

	private Component comp;
	
	public Milk(Component comp) {
		this.comp = comp;
	}

	@Override
	public String getDescription() {
		return comp.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return comp.cost() + 0.1;
	}
}
