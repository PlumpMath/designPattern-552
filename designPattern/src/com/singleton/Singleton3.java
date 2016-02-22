package com.singleton;
/**
 * 双重检查加锁,注意volatile
 * @author Administrator
 *
 */
public class Singleton3 {

	public static volatile Singleton3 singleton;
	
	private Singleton3(){
		
	}
	
	public static Singleton3 getInstance(){
		if (singleton == null) {
			synchronized (Singleton3.class) {
				if (singleton == null) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}
}
