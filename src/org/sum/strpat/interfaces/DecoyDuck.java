package org.sum.strpat.interfaces;

public class DecoyDuck extends Duck implements IFlyable, IQuackable {

	@Override
	public void display() {
		System.out.println("外观是木头.");

	}

	@Override
	public void quack() {
		System.out.println("不能叫.");
		
	}

	@Override
	public void fly() {
		System.out.println("不能飞.");
		
	}

}
