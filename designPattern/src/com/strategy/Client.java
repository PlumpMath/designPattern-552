package com.strategy;

public class Client {

	public static void main(String[] args) {
		Duck duck = new RedHeadDuck();
		duck.setFlyBehavior(new FlyWithWings());
		duck.setQuackBehavior(new Quack());
		duck.display();
		duck.performFly();
		duck.perfomQuack();
		duck.setFlyBehavior(new FlyNoWay());
		duck.performFly();
	}
}
