package org.sum.strpat.extend;

public class RubberDuck extends Duck {

	
	@Override
	public void quack() {
		System.out.println("I'm quacking：吱吱.");
	}

	@Override
	public void display() {
		System.out.println("外观是橡皮.");

	}

	@Override
	public void fly() {
		// nothing，不会飞
	}

}
