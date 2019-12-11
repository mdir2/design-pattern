package com.design.pattern.decorator.coffee;

import com.design.pattern.decorator.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "다크 로스트 커피";
	}

	@Override
	public double cost() {
		double cost = 0.0;
		switch (getSize()) {
			case SHORT:
				cost = 1.2;
				break;
			case TALL:
				cost =  1.7;
				break;
			case GRANDE:
				cost =  2.2;
				break;
			case VENTI:
				cost =  2.7;
				break;
		}
		return cost;
	}
}
