package org.sum.obepat.obsever.pull;

public class CurrentConditionObserver implements IObserver, IDisplay {

	private float temperature;
	private float humidity;
	
	public CurrentConditionObserver(Subject sub){
		sub.addObserver(this);
	}
	
	@Override
	public void update(Subject sub, Object arg) {
		if (sub instanceof WeatherDataSub) {
			WeatherDataSub wds = (WeatherDataSub)sub;
			this.temperature = wds.getTemperature();
			this.humidity = wds.getHumidity();
			display();
		}
		
	}

	@Override
	public void display() {
		System.out.println(String.format("��ʾ��ǰ�¶�:temperature-%f, humidity-%f.", temperature, humidity));
	}

}
