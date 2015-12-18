package com.observer.java;

import java.util.Observable;
/**
 * 继承了java提供的实现好的可观察者父类
 * 注意已经实现好的通知,即可以采用push的方式推送数据
 * 也可以采用pull的方式,让观察者自己获取数据
 * @author Administrator
 *
 */
public class WeatherData extends Observable{
	
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
	 * 当气象站得到更新观测值时,我们通知观察者
	 */
	public void measurementsChanged(){
		setChanged();//必须先调用一下此方法
		notifyObservers();//如果传递参数则是push,反之pull
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

	/*提供获取数据的方法*/
	
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
