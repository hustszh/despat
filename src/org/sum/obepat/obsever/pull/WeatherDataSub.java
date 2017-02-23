package org.sum.obepat.obsever.pull;

public class WeatherDataSub extends Subject{

	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataSub() {
	}
	
	/*
	 * 一旦气象测量关系，此方法会被调用
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humi, float pres){
		this.temperature = temp;
		this.humidity = humi;
		this.pressure = pres;
		
		measurementsChanged();
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
