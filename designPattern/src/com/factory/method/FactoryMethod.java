package com.factory.method;
/**
 * 工厂方法,把创建对象的方法抽象,具体放到子类方法中去实现,符合开闭原则
 * @author Administrator
 *
 */
public abstract class FactoryMethod {
	/**
	 * 创建所有类型的披萨
	 * @param type
	 * @return
	 */
	public abstract Pizza createPizza();
}
