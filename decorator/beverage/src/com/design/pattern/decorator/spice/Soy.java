package com.design.pattern.decorator.spice;

import com.design.pattern.decorator.Beverage;

public class Soy extends ConidmentDecorator {
	Beverage beverage;

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 소이";
	}

	@Override
	public double cost() {
		return .25 + beverage.cost();
	}
}
