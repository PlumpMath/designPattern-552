package com.observer.java;

import java.util.Observer;

public class Client {

	public static void main(String[] args) {
		//构造一个可被观察的对象
		WeatherData weatherData = new WeatherData();
		
		//两个观察者对象,都注册到上面的可观察者对象的容器中
		Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		Observer StatisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 50, 20);
		weatherData.setMeasurements(90, 60, 30);
		
	}
}
