package com.design.pattern.strategy.behavior.quack;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("silent.....");
	}
}
