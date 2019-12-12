package com.design.pattern;

import com.design.pattern.factory.SimplePizzaFactory;
import com.design.pattern.pizza.Pizza;
import com.design.pattern.store.ChicagoPizzaStore;
import com.design.pattern.store.NYPizzaStore;
import com.design.pattern.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
    
        Pizza pizza = pizzaStore.orderPizza("cheese");
        
        System.out.println("wook ordered a " + pizza.getName() + "\n");
    
        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizza = pizzaStore.orderPizza("cheese");
        
        System.out.println("wook ordered a " + pizza.getName() + "\n");
    }
}
