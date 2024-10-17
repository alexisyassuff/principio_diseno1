package org.example.InterfaceSegregationPrinciple;

public class Barista implements CoffeeMaker {
    @Override
    public void makeCoffee() {
        System.out.println("Barista preparando café.");
    }
}
