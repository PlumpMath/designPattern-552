package com.observer.self;

public interface Observer {

	/**
	 * 用于被观察者回调的方法,把变化的数据push给观察者
	 * @param temp 温度
	 * @param humidity 湿度
	 * @param pressure 大气压
	 */
	void update(float temp,float humidity,float pressure);
}
