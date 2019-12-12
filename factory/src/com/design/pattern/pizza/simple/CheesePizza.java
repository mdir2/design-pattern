package com.design.pattern.pizza.simple;

import com.design.pattern.pizza.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Simple Cheese Pizza";
        dough = "Simple Dough";
        sauce = "Simple Tomato Sauce";
    
        toppings.add("Cheese");
    }
}
