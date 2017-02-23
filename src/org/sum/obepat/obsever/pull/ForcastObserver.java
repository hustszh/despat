package org.sum.obepat.obsever.pull;

public class ForcastObserver implements IDisplay, IObserver {

	public ForcastObserver(Subject sub){
		sub.addObserver(this);
	}
	
	@Override
	public void update(Subject sub, Object arg) {
		display();
	}

	@Override
	public void display() {
		System.out.println("ÏÔÊ¾Ô¤²âÎÂ¶È.");
	}

}
