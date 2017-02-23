package org.sum.strpat.interfaces;

public class RedheadDuck extends Duck implements IQuackable, IFlyable {

	@Override
	public void quack() {
		System.out.println("I'm quacking:����.");

	}

	@Override
	public void display() {
		System.out.println("����Ǻ�ͷ.");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying.");
		
	}

}
