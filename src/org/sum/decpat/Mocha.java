package org.sum.decpat;

public class Mocha extends Decorator {

	private Component comp;
	
	public Mocha(Component comp) {
		this.comp = comp;
	}
	
	@Override
	public String getDescription() {
		return comp.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return comp.cost() + 0.33;
	}

}
