/*
4. Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.

 */
package com.basics.java.assignment7.cycleFactories;

import java.util.ArrayList;

public class CycleFactoriesMain {
    public static void main(String[] args) {
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();
        TricycleFactory tricycleFactory = new TricycleFactory();
        ArrayList<Cycle> cycles = new ArrayList<>();
        cycles.add(unicycleFactory.createInstance());
        cycles.add(bicycleFactory.createInstance());
        cycles.add(tricycleFactory.createInstance());
        for(Cycle c : cycles)
        {
            c.getDetails();
        }
    }
}
