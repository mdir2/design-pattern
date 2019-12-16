package com.design.pattern.factory;

import com.design.pattern.ingredient.cheese.Cheese;
import com.design.pattern.ingredient.cheese.Mozzarella;
import com.design.pattern.ingredient.clams.Clams;
import com.design.pattern.ingredient.clams.FrozenClams;
import com.design.pattern.ingredient.dough.Dough;
import com.design.pattern.ingredient.dough.ThickCrustDough;
import com.design.pattern.ingredient.peperoni.Peperoni;
import com.design.pattern.ingredient.peperoni.SlicedPeperoni;
import com.design.pattern.ingredient.sauce.PlumTomatoSauce;
import com.design.pattern.ingredient.sauce.Sauce;
import com.design.pattern.ingredient.veggies.BlackOlives;
import com.design.pattern.ingredient.veggies.Eggplant;
import com.design.pattern.ingredient.veggies.Spinach;
import com.design.pattern.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }
    
    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
    
    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }
    
    @Override
    public Veggies[] createVeggies() {
        final Veggies[] veggies = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }
    
    @Override
    public Peperoni createPeperoni() {
        return new SlicedPeperoni();
    }
    
    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
