package org.sum.obepat.obsever.push;

public class ForcastObserver implements IObserver, IDisplay{
	
	public ForcastObserver(ISubject subject){
		subject.registerObserver(this);
	}

	@Override
	public void update(TransData td) {
		display();
	}

	@Override
	public void display() {
		System.out.println("ÏÔÊ¾Ô¤²âÎÂ¶È.");
	}

}
