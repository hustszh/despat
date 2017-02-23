package org.sum.obepat;

public class WeatherData {

	private float temperature;
	private float humidity;
	private float pressure;
	
	/*
	 * 一旦气象测量关系，此方法会被调用
	 */
	public void measurementsChanged() {
		
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}
