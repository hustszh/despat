package org.sum.strpat.extend;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("外观是木头.");
	}

	@Override
	public void swim() {
		// nothing，不会游泳
	}

	@Override
	public void quack() {
		// nothing，不会叫
	}

	@Override
	public void fly() {
		// nothing，不会飞
	}
	
}
