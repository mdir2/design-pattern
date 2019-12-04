package com.design.pattern.strategy.duck;

public class RubberDuck extends Duck {

	@Override
	void display() {
		System.out.println("This is RubberDuck and I can't fly");
	}
}
