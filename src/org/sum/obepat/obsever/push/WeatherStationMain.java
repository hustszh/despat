package org.sum.obepat.obsever.push;

public class WeatherStationMain {

	public static void main(String[] args) {
		WeatherDataSub wds = new WeatherDataSub();
		
		CurrentConditionObserver cco = new CurrentConditionObserver(wds);
		StatisticsObserver so = new StatisticsObserver(wds);
		ForcastObserver fo = new ForcastObserver(wds);

		wds.setMeasurements(10.8f, 30.0f, 25.0f);
		wds.setMeasurements(33.8f, 11.0f, 77.0f);
	}

}
