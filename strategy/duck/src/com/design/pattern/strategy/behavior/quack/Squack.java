package com.design.pattern.strategy.behavior.quack;

public class Squack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("S~~~~~~ quack!!! quack!!!");
	}
}
