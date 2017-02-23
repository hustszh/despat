package org.sum.obepat.extend;

public class WeatherDataExt {

	private float temperature;
	private float humidity;
	private float pressure;
	
	private CurrentConditionDisplay ccd;
	private StatisticsDisplay sd;
	private ForcastDisplay fd;
	
	public WeatherDataExt(CurrentConditionDisplay ccd, StatisticsDisplay sd, ForcastDisplay fd) {
		super();
		this.ccd = ccd;
		this.sd = sd;
		this.fd = fd;
	}
	
	/*
	 * 一旦气象测量关系，此方法会被调用
	 */
	public void measurementsChanged() {
		float temp = getTemperature();
		float humi = getHumidity();
		float pres = getPressure();
		
		ccd.update(temp, humi, pres);
		sd.update(temp, humi, pres);
		fd.update(temp, humi, pres);
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
