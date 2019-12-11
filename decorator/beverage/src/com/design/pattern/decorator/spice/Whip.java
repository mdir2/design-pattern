package com.design.pattern.decorator.spice;

import com.design.pattern.decorator.Beverage;

public class Whip extends ConidmentDecorator {
	Beverage beverage;

	public Whip(final Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑크림";
	}

	@Override
	public double cost() {
		return .2 + beverage.cost();
	}
}
