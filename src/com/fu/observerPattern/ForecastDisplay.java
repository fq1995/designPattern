package com.fu.observerPattern;

import java.util.List;

public class ForecastDisplay implements Observer,DisplayElement {

	private WeatherData weatherData;
	
	private List<Float> forecastTemperatures;//未来几天温度
	
	
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		this.forecastTemperatures = weatherData.getForecastTemperatures();
		display();

	}

	@Override
	public void display() {
		System.out.println("未来几天气温");
		int count = forecastTemperatures.size();
		for (int i = 0; i < count; i++) {
			System.out.println("第"+i+"天："+forecastTemperatures.get(i)+"℃");
		}
	}

}
