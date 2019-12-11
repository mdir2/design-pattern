package com.design.pattern.decorator;

import com.design.pattern.decorator.coffee.DarkRoast;
import com.design.pattern.decorator.coffee.Espresso;
import com.design.pattern.decorator.spice.Mocha;
import com.design.pattern.decorator.spice.Whip;

public class Main {
	public static void main(String[] args) {
		Beverage beverage = new DarkRoast();
		beverage.setSize(Beverage.Size.TALL);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
