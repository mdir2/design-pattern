package com.design.pattern.decorator.coffee;

import com.design.pattern.decorator.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "에스프레소";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
