package com.factory.method;

public class Client {

	public static void main(String[] args) {
		FactoryMethod fm = new VeggieFactory();
		Pizza pizza = fm.createPizza();
		System.out.println(pizza.getDescription());
	}
}
