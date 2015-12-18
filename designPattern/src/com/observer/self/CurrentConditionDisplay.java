package com.observer.self;

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
		weatherData.registerObserver(this);//this指代当前实例化的CurrentConditionDisplay对象
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"+ temperature +
				"F degrees and " + humidity + "% humidity");
	}

	
}
