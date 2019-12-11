package com.design.pattern.decorator;

import com.design.pattern.decorator.spice.ConidmentDecorator;

public abstract class Beverage {
	private ConidmentDecorator conidmentDecorator;

	protected String description;

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
