package com.singleton;
/**
 * 急切式,jvm启动马上创建实例,加重启动时负担
 * @author Administrator
 *
 */
public class Singleton2 {

	public static Singleton2 singleton = new Singleton2();
	
	private Singleton2(){
		
	}
	
	public static synchronized Singleton2 getInstance(){
		return singleton;
	}
}
