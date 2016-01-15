package com.factory.simple;

public class Client {

	public static void main(String[] args) {
		Pizza pizza = SimpleFactory.createPizza("veggie");
		System.out.println(pizza.getDescription());
	}
}
