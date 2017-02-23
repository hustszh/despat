package org.sum.obepat.obsever.push;

public class StatisticsObserver implements IObserver, IDisplay{

	public StatisticsObserver(ISubject subject){
		subject.registerObserver(this);
	}
	
	@Override
	public void update(TransData td) {
		display();

	}

	@Override
	public void display() {
		System.out.println("显示统计温度.");
		
	}

}
