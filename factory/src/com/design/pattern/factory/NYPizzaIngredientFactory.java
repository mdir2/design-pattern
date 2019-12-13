package com.design.pattern.factory;

import com.design.pattern.ingredient.cheese.Cheese;
import com.design.pattern.ingredient.cheese.ReggianoCheese;
import com.design.pattern.ingredient.clams.Clams;
import com.design.pattern.ingredient.clams.FreshClams;
import com.design.pattern.ingredient.dough.Dough;
import com.design.pattern.ingredient.dough.ThinCrustDough;
import com.design.pattern.ingredient.peperoni.Peperoni;
import com.design.pattern.ingredient.peperoni.SlicedPeperoni;
import com.design.pattern.ingredient.sauce.MarinaraSauce;
import com.design.pattern.ingredient.sauce.Sauce;
import com.design.pattern.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
    
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    
    @Override
    public Veggies[] createVeggies() {
        final Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }
    
    @Override
    public Peperoni createPeperoni() {
        return new SlicedPeperoni();
    }
    
    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
