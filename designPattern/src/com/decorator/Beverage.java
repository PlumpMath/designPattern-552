package com.decorator;
/**
 * 饮料抽象类
 * @author Administrator
 *
 */
public abstract class Beverage {

	public String description = "UnKnown Beverage";
	
	/**
	 * 描述
	 * @return
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * 计费
	 * @return
	 */
	public abstract double cost();
}
