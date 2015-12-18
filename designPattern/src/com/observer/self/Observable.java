package com.observer.self;

public interface Observable {

	/**
	 * 注册观察者
	 * @param o
	 */
	void registerObserver(Observer o);
	/**
	 * 移除观察者
	 * @param o
	 */
	void removeObserver(Observer o);
	/**
	 * 通知所有观察者
	 * @param o
	 */
	void notifyObservers();
}
