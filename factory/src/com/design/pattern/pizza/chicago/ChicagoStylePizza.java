package com.design.pattern.pizza.chicago;

import com.design.pattern.pizza.Pizza;

public class ChicagoStylePizza extends Pizza {
    public ChicagoStylePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum tomato Sauce";
        
        toppings.add("Shredded Mozzarella Cheese");
    }
}
