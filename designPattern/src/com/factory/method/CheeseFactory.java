package com.factory.method;

public class CheeseFactory extends FactoryMethod{

	@Override
	public Pizza createPizza() {
		return new CheesePizza();
	}

}
