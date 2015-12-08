package com.strategy;

public abstract class Duck {

	//利用set方法引入两个接口变量,可动态注入
	private FlyBehavior flyBehavior;
	private QuackBehavior QuackBehavior;
	
	/**
	 * 具体子类实现长什么样子
	 */
	public abstract void display();
	
	public void swim(){
		System.out.println("所有鸭子都必须会游泳");
	}
	
	/**
	 * 飞行动作交给接口的实现来完成
	 */
	public void performFly(){
		flyBehavior.fly();
	}
	/**
	 * 叫动作交给接口实现来完成
	 */
	public void perfomQuack(){
		QuackBehavior.quack();
	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return QuackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		QuackBehavior = quackBehavior;
	}
	
	
	
}
