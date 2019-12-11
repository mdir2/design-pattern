package com.design.pattern.decorator.spice;

import com.design.pattern.decorator.Beverage;

public class Milk extends ConidmentDecorator {

	Beverage beverage;

	public Milk(final Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 우유";
	}

	@Override
	public double cost() {
		return .2 + beverage.cost();
	}
}
