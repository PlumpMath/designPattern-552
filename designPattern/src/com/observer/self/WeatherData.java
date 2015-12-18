package com.observer.self;

import java.util.ArrayList;

/**
 * 实现的是自己写的简单接口,没有考虑线程安全,性能优化等
 * @author Administrator
 *
 */
public class WeatherData implements Observable{
	
	/**
	 * 储存观察者的容器
	 */
	private ArrayList<Observer> observers;
	/**
	 * 温度
	 */
	private float temperature;
	/**
	 * 湿度
	 */
	private float humidity;
	/**
	 * 大气压
	 */
	private float pressure;
	
	

	/**
	 * 构造被观察者对象,并实例化观察者容器
	 */
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(int i = 0;i<observers.size();i++){
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);//所有的观察者都实现了这个方法
		}
	}
	
	/**
	 * 当气象站得到更新观测值时,我们通知观察者
	 */
	public void measurementsChanged(){
		notifyObservers();
	}
	
	/**
	 * 模拟获取观测值,可以是从远程服务,或者是测量装置等等
	 * @param temperature 温度
	 * @param humidity 湿度
	 * @param pressure 大气压
	 */
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();//获取新的观测值后,调用通知观察者的方法
	}

}
