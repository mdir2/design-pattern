package com.design.pattern.pizza.chicago;

import com.design.pattern.factory.PizzaIngredientFactory;
import com.design.pattern.pizza.Pizza;

public class ChicagoStylePizza extends Pizza {
    
    PizzaIngredientFactory ingredientFactory;
    
    public ChicagoStylePizza(final PizzaIngredientFactory ingredientFactory) {
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
