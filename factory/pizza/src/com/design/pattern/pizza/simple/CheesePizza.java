package com.design.pattern.pizza.simple;

import com.design.pattern.factory.PizzaIngredientFactory;
import com.design.pattern.pizza.Pizza;

public class CheesePizza extends Pizza {
    
    PizzaIngredientFactory ingredientFactory;
    
    public CheesePizza(final PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
