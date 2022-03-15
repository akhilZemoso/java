package com.basics.java.javaoreilly.chapter7;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC = new IceCream("Chocolate",2,3);
        IceCream yourIC = new IceCream("Strawberry",2,1);
        myIC.addToppings("nuts");
        myIC.addToppings("cherries");

        yourIC.addToppings("springles");

        printIC(myIC);
        printIC(yourIC);
    }
    public static void printIC(IceCream iceCream){
        System.out.println(iceCream.getName());
        System.out.println("Cost : $"+iceCream.getCost());
        System.out.println("Topped with :");
        iceCream.printToppings();
        System.out.println();
    }
}
