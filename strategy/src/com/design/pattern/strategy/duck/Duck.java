package com.design.pattern.strategy.duck;

public abstract class Duck {
	void quack() {
		System.out.println("Quack Quack!!!");
	}

	void swim() {
		System.out.println("I'm swimming");
	}

	// fly 메소드 확장
	void fly() {
		System.out.println("I believe that I can fly");
	}

	abstract void display();

	public Duck() {
		this.quack();
		this.swim();
		this.fly();
		this.display();
	}
}
