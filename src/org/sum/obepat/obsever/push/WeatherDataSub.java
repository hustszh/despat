package org.sum.obepat.obsever.push;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSub implements ISubject{

	private List<IObserver> observerList;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataSub() {
		observerList = new ArrayList<IObserver>();// push pattern: keep a observer list
	}
	
	/*
	 * 一旦气象测量关系，此方法会被调用
	 */
	public void measurementsChanged() {
		notifyObservers();
		
	}

	@Override
	public void registerObserver(IObserver oberserver) {
		observerList.add(oberserver);
	}

	@Override
	public void removeObserver(IObserver oberserver) {
		int idx = observerList.indexOf(oberserver);
		if ( idx >= 0 )
			observerList.remove(oberserver);
	}

	@Override
	public void notifyObservers() {
		TransData td = new TransData(temperature, humidity, pressure);
		for ( int i = 0; i < observerList.size(); i++ ){
			IObserver ob = observerList.get(i);
			ob.update(td);
		}
	}
	
	public void setMeasurements(float temp, float humi, float pres){
		this.temperature = temp;
		this.humidity = humi;
		this.pressure = pres;
		
		measurementsChanged();
	}
}
