package com.design.pattern.store;

import com.design.pattern.pizza.Pizza;

public abstract class PizzaStore {
    
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        System.out.println("Pizza: " + pizza.getClass().getSimpleName());
    
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    
        return pizza;
    }
    
    abstract Pizza createPizza(final String type);
}