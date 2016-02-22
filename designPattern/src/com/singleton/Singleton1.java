package com.singleton;
/**
 * synchronized对多线程有巨大性能影响
 * @author Administrator
 *
 */
public class Singleton1 {

	public static Singleton1 singleton;
	
	private Singleton1(){
		
	}
	
	public static synchronized Singleton1 getInstance(){
		if (singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}
}
