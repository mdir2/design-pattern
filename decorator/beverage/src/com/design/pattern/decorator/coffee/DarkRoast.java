package com.design.pattern.decorator.coffee;

import com.design.pattern.decorator.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "다크 로스트 커피";
	}

	@Override
	public double cost() {
		return 1.2;
	}
}
