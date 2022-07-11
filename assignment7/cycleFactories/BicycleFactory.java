package com.basics.java.assignment7.cycleFactories;

public class BicycleFactory extends CycleFactory{
    @Override
    public Cycle createInstance() {
        return new Bicycle();
    }
}
