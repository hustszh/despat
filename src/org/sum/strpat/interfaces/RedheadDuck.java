package org.sum.strpat.interfaces;

public class RedheadDuck extends Duck implements IQuackable, IFlyable {

	@Override
	public void quack() {
		System.out.println("I'm quacking:呱呱.");

	}

	@Override
	public void display() {
		System.out.println("外观是红头.");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying.");
		
	}

}
