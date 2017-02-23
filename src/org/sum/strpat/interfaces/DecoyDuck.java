package org.sum.strpat.interfaces;

public class DecoyDuck extends Duck implements IFlyable, IQuackable {

	@Override
	public void display() {
		System.out.println("�����ľͷ.");

	}

	@Override
	public void quack() {
		System.out.println("���ܽ�.");
		
	}

	@Override
	public void fly() {
		System.out.println("���ܷ�.");
		
	}

}
