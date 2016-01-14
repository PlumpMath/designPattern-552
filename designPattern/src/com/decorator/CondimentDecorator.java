package com.decorator;
/**
 * 调料抽象类,继承抽象饮料类,为了保证和被装饰的饮料属于同一个超类
 * @author Administrator
 *
 */
public abstract class CondimentDecorator extends Beverage{

	/**
	 * 重新定义装饰者的描述,防止受超类的影响
	 */
	@Override
	public abstract String getDescription();
}
