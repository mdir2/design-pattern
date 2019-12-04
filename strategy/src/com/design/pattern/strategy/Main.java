package com.design.pattern.strategy;

import com.design.pattern.strategy.behavior.fly.FlyNoWay;
import com.design.pattern.strategy.behavior.fly.FlyRocketPowered;
import com.design.pattern.strategy.behavior.fly.FlyWithWings;
import com.design.pattern.strategy.behavior.quack.MuteQuack;
import com.design.pattern.strategy.behavior.quack.Quack;
import com.design.pattern.strategy.behavior.quack.Squack;
import com.design.pattern.strategy.duck.*;

public class Main {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.setQuackBehavior(new Quack());
		duck.setFlyBehavior(new FlyWithWings());
		duck.doEverything();

		System.out.println("\n\r");

		duck = new RedHeadDuck();
		duck.setQuackBehavior(new Quack());
		duck.setFlyBehavior(new FlyWithWings());
		duck.doEverything();

		System.out.println("\n\r");

		duck = new RubberDuck();
		duck.setQuackBehavior(new Squack());
		duck.setFlyBehavior(new FlyNoWay());
		duck.doEverything();

		System.out.println("\n\r");

		duck = new ModelDuck();
		duck.setQuackBehavior(new MuteQuack());
		duck.setFlyBehavior(new FlyNoWay());
		duck.display();
		duck.performFly();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.doEverything();
	}
}
