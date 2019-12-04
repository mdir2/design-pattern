package com.design.pattern.strategy.behavior.fly;

public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("Fly with Rocket powered energy!!!");
	}
}
