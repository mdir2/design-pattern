package com.design.pattern.store;

import com.design.pattern.pizza.ny.NYStyleCheesePizza;
import com.design.pattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(final String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
