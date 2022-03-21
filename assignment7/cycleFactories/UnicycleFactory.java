package com.basics.java.assignment7.cycleFactories;

public class UnicycleFactory extends CycleFactory{

    @Override
    public Cycle createInstance() {
        return new Unicycle();
    }
}
