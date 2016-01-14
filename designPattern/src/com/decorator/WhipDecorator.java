package com.decorator;
/**
 * 奶泡调料
 * @author Administrator
 *
 */
public class WhipDecorator extends CondimentDecorator{

	/**
	 * 需要把被装饰者组合进来
	 */
	public Beverage beverage;
	
	public WhipDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	/**
	 * 描述,首先委托给被装饰者获取描述,然后进行补充
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Whip";
	}

	/**
	 * 计费,首先委托给被装饰者计费,然后进行累加调料
	 */
	@Override
	public double cost() {
		return beverage.cost() + 0.2;
	}

}
