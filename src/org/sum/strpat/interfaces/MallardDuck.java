package org.sum.strpat.interfaces;

public class MallardDuck extends Duck implements IQuackable, IFlyable {

	@Override
	public void display() {
		System.out.println("�������ͷ.");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying.");
	}

	@Override
	public void quack() {
		System.out.println("I'm quacking:����.");
	}

}
