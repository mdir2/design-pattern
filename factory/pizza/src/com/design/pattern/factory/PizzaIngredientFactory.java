package com.design.pattern.factory;

import com.design.pattern.ingredient.cheese.Cheese;
import com.design.pattern.ingredient.clams.Clams;
import com.design.pattern.ingredient.dough.Dough;
import com.design.pattern.ingredient.peperoni.Peperoni;
import com.design.pattern.ingredient.sauce.Sauce;
import com.design.pattern.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Peperoni createPeperoni();
    Clams createClam();
}
