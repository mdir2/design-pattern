package com.design.pattern.factory.pizza;

public class PeperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("준비과정");
    }
    
    @Override
    public void bake() {
        System.out.println("베이킹");
    }
    
    @Override
    public void cut() {
        System.out.println("피자 자르기");
    }
    
    @Override
    public void box() {
        System.out.println("피자 박싱하기");
    }
}
