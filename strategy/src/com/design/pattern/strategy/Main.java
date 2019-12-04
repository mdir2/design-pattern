package com.design.pattern.strategy;

import com.design.pattern.strategy.duck.Duck;
import com.design.pattern.strategy.duck.MallardDuck;
import com.design.pattern.strategy.duck.RedHeadDuck;
import com.design.pattern.strategy.duck.RubberDuck;

public class Main {

	public static void main(String[] args) {
		new MallardDuck();
		System.out.println("\n\r");
		new RedHeadDuck();
		System.out.println("\n\r");
		new RubberDuck();
	}
}
