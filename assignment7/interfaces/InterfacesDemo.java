package com.basics.java.assignment7.interfaces;

public class InterfacesDemo extends ConcreteClass implements ExtendingInterfaces{
    @Override
    public void newMethod() {
        System.out.println("Extending interface's new method");
    }

    @Override
    public void fIMethod1() {
        System.out.println("First interface method1");
    }

    @Override
    public void fIMethod2() {
        System.out.println("First interface method2");
    }

    @Override
    public void sIMethod1() {
        System.out.println("Second interface method1");
    }

    @Override
    public void sIMethod2() {
        System.out.println("Second interface method2");
    }

    @Override
    public void tIMethod1() {
        System.out.println("Third interface method1");
    }

    @Override
    public void tIMethod2() {
        System.out.println("Third interface method2");
    }
    public void first(FirstInterface firstInterface){
        firstInterface.fIMethod1();
        firstInterface.fIMethod2();
    }
    public void second(SecondInterface secondInterface){
        secondInterface.sIMethod1();
        secondInterface.sIMethod2();
    }
    public void third(ThirdInterface thirdInterface){
        thirdInterface.tIMethod1();
        thirdInterface.tIMethod2();
    }
    public void extended(ExtendingInterfaces extendingInterface){
        extendingInterface.newMethod();
    }

    public static void main(String[] args) {
        InterfacesDemo demo=new InterfacesDemo();
        demo.first(demo);
        demo.second(demo);
        demo.third(demo);
        demo.extended(demo);
    }
}
