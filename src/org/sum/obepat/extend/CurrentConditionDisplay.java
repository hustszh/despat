package org.sum.obepat.extend;

public class CurrentConditionDisplay implements IDisplay{

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("显示当前温度.");
		
	}

}
