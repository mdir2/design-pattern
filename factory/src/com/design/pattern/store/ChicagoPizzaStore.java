package com.design.pattern.store;

import com.design.pattern.factory.ChicagoPizzaIngredientFactory;
import com.design.pattern.factory.PizzaIngredientFactory;
import com.design.pattern.pizza.Pizza;
import com.design.pattern.pizza.chicago.ChicagoStylePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(final String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new ChicagoStylePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        return pizza;
    }
}
