package com.design.pattern.store;

import com.design.pattern.factory.NYPizzaIngredientFactory;
import com.design.pattern.factory.PizzaIngredientFactory;
import com.design.pattern.pizza.Pizza;
import com.design.pattern.pizza.simple.CheesePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(final String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
