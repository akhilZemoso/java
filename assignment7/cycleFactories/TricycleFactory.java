package com.basics.java.assignment7.cycleFactories;

public class TricycleFactory extends CycleFactory{

    @Override
    public Cycle createInstance() {
        return new Tricycle();
    }
}
