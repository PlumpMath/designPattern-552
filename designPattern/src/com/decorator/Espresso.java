package com.decorator;
/**
 * 浓咖啡
 * @author Administrator
 *
 */
public class Espresso extends Beverage{
	
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.1;
	}

}
