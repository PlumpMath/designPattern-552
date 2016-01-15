package com.factory.method;

public class VeggieFactory extends FactoryMethod{

	@Override
	public Pizza createPizza() {
		return new VeggiePizza();
	}

	
}
