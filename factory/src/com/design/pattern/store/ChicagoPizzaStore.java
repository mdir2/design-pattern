package com.design.pattern.store;

import com.design.pattern.pizza.Pizza;
import com.design.pattern.pizza.chicago.ChicagoStylePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(final String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStylePizza();
        }
        return pizza;
    }
}
