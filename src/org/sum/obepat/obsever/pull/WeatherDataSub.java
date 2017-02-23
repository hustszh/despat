package org.sum.obepat.obsever.pull;

public class WeatherDataSub extends Subject{

	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataSub() {
	}
	
	/*
	 * һ�����������ϵ���˷����ᱻ����
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
