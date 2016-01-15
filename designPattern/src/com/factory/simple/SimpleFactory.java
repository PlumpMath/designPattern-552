package com.factory.simple;
/**
 * 简单工厂,随着披萨类型,风味的增加,不利于扩展维护
 * @author Administrator
 *
 */
public class SimpleFactory {
	/**
	 * 创建所有类型的披萨
	 * @param type
	 * @return
	 */
	public static Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}else if (type.equals("veggie")){
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
