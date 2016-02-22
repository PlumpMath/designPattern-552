package com.singleton;
/**
 * 延迟式,不适合多线程
 * @author Administrator
 *
 */
public class Singleton {

	public static Singleton singleton;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
