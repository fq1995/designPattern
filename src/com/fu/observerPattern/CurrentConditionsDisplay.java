package com.fu.observerPattern;

import java.util.List;

public class CurrentConditionsDisplay implements Observer,DisplayElement {

	private WeatherData weatherData;
	
	private float temperature;//温度
	private float humidity;//湿度
	private float pressure;//气压
	
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}



	@Override
	public void update() {
		temperature = weatherData.getTemperature();
		humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
        display();
	}



	@Override
	public void display() {
		System.out.println("当前温度："+temperature);
		System.out.println("当前湿度："+humidity);
		System.out.println("当前气压："+pressure);
	}

}
