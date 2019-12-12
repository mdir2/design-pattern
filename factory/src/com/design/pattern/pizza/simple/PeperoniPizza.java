package com.design.pattern.pizza.simple;

import com.design.pattern.pizza.Pizza;

public class PeperoniPizza extends Pizza {
    public PeperoniPizza() {
        name = "Simple Peperoni Pizza";
        dough = "Simple Dough";
        sauce = "Simple Tomato Sauce";
    
        toppings.add("Cheese");
        toppings.add("peperoni");
    }
}
