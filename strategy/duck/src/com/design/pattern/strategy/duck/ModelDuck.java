package com.design.pattern.strategy.duck;

public class ModelDuck extends Duck {
	@Override
	public void display() {
		System.out.println("This is model duck and I'm not a real duck");
	}
}
