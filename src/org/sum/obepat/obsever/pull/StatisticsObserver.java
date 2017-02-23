package org.sum.obepat.obsever.pull;

public class StatisticsObserver implements IDisplay, IObserver {

	public StatisticsObserver(Subject sub){
		sub.addObserver(this);
	}
	@Override
	public void update(Subject sub, Object arg) {
		display();

	}

	@Override
	public void display() {
		System.out.println("显示统计温度.");

	}

}
