package com.design.pattern.pizza.simple;

import com.design.pattern.factory.PizzaIngredientFactory;
import com.design.pattern.pizza.Pizza;

public class PeperoniPizza extends Pizza {
    
    PizzaIngredientFactory ingredientFactory;
    
    public PeperoniPizza(final PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        peperoni = ingredientFactory.createPeperoni();
    }
}
