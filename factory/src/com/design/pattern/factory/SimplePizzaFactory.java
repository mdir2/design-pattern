package com.design.pattern.factory;

import com.design.pattern.pizza.*;
import com.design.pattern.pizza.simple.CheesePizza;
import com.design.pattern.pizza.simple.PeperoniPizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
        } else if (type.equals("peperoni")) {
//            pizza = new PeperoniPizza();
        }
        return pizza;
    }
}
