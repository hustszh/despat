package org.sum.obepat.extend;

public class StatisticsDisplay implements IDisplay{

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("显示统计温度.");
		
	}

}
