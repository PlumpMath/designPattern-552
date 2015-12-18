package com.observer.java;

import java.util.Observable;
import java.util.Observer;

import com.observer.self.DisplayElement;

/**
 * 记录当前状态
 * @author Administrator
 *
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{
	/**
	 * 温度
	 */
	private float temperature;
	/**
	 * 湿度
	 */
	private float humidity;
	/**
	 * 被观察者对象,用于注册观察者
	 */
	private Observable weatherData;
	
	
	
	/**
	 * 实例化观察者对象,并注册到被观察者的容器中
	 * @param weatherData
	 */
	public CurrentConditionDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);//this指代当前实例化的CurrentConditionDisplay对象
	}

	@Override
	public void update(Observable o, Object arg) {
		//pull的方式获取数据,需要被观察者对象的引用才可以
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"+ temperature +
				"F degrees and " + humidity + "% humidity");
	}

	
}
