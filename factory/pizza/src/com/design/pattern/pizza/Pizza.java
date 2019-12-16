package com.design.pattern.pizza;

import com.design.pattern.ingredient.cheese.Cheese;
import com.design.pattern.ingredient.clams.Clams;
import com.design.pattern.ingredient.dough.Dough;
import com.design.pattern.ingredient.peperoni.Peperoni;
import com.design.pattern.ingredient.sauce.Sauce;
import com.design.pattern.ingredient.veggies.Veggies;

import java.util.*;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Peperoni peperoni;
    protected Clams clams;
    
    public abstract void prepare();
    
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
