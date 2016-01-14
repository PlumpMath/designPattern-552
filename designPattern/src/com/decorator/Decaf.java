package com.decorator;
/**
 * 低咖啡因咖啡
 * @author Administrator
 *
 */
public class Decaf extends Beverage{
	
	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return 2.2;
	}

}
