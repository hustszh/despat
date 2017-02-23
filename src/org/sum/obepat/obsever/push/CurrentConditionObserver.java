package org.sum.obepat.obsever.push;

public class CurrentConditionObserver implements IObserver, IDisplay{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionObserver(ISubject subject){
		subject.registerObserver(this);
	}

	@Override
	public void update(TransData td) {
		this.temperature = td.getTemperature();
		this.humidity = td.getHumidity();
		this.pressure = td.getPressure();
		display();
	}

	@Override
	public void display() {
		System.out.println(String.format("显示当前温度:temperature-%f, humidity-%f, pressure-%f.", temperature, humidity, pressure));
	}

}
