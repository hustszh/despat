package org.sum.strpat.strategy;

public abstract class Duck {

	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;
	
	public void swim(){
		System.out.println("ƒ‹”Œ”æ");
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(IFlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(IQuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
}
