package com.design.pattern.decorator.spice;

import com.design.pattern.decorator.Beverage;

public class Mocha extends ConidmentDecorator {
	Beverage beverage;

	public Mocha(final Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		return .1 + beverage.cost();
	}
}
