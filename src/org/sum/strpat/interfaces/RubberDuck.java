package org.sum.strpat.interfaces;

public class RubberDuck extends Duck implements IQuackable {

	@Override
	public void quack() {
		System.out.println("I'm quacking:֨֨.");

	}

	@Override
	public void display() {
		System.out.println("�������Ƥ.");

	}

}
