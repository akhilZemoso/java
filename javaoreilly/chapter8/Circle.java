package com.basics.java.javaoreilly.chapter8;

public class Circle {
    private double radius;
    public Circle(){
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI* Math.pow(radius,2);
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
}
