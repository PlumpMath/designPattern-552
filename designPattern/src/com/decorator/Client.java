package com.decorator;

public class Client {

	public static void main(String[] args) {
		//单点浓咖啡
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + ";RMB:" + beverage.cost());
		//+摩卡调料
		beverage = new MochaDecorator(beverage);
		System.out.println(beverage.getDescription() + ";RMB:" + beverage.cost());
		//+奶泡调料
		beverage = new WhipDecorator(beverage);
		System.out.println(beverage.getDescription() + ";RMB:" + beverage.cost());
	}
}
