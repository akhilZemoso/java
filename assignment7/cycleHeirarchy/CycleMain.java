/*
    2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle. Try to call balance( ) on each element of the array and observe the results.
    Downcast and call balance( ) and observe what happens.
 */
package com.basics.java.assignment7.cycleHeirarchy;

import java.util.ArrayList;

public class CycleMain {
    public static void main(String[] args) {
        ArrayList<Cycle> cycles = new ArrayList<>();
        cycles.add((Cycle) new Unicycle());
        cycles.add((Cycle) new Bicycle());
        cycles.add((Cycle) new Tricycle());
        for (Cycle c : cycles){
            Unicycle u = (Unicycle) c;
            u.balance();
        }
    }
}
