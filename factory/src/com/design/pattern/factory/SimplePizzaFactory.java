package com.design.pattern.factory;

import com.design.pattern.factory.pizza.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
    
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("peperoni")) {
            pizza = new PeperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}
