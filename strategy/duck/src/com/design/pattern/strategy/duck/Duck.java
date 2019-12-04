package com.design.pattern.strategy.duck;

import com.design.pattern.strategy.behavior.fly.FlyBehavior;
import com.design.pattern.strategy.behavior.quack.QuackBehavior;

public abstract class Duck {
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;

	public abstract void display();

	public void setQuackBehavior(final QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(final FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void swim() {
		System.out.println("I'm swimming");
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void doEverything() {
		this.display();
		this.swim();
		this.performQuack();
		this.performFly();
	}
}
