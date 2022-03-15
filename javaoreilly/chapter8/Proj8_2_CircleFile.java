package com.basics.java.javaoreilly.chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleList = new ArrayList<>();
        fillArrayList(circleList);
        printCircles(circleList);
    }
    public static void fillArrayList(ArrayList<Circle> circleAL){
        Scanner infile;
        try {
            Circle temp;
            double radius;
            infile = new Scanner(new File("circle_data.txt"));
            while (infile.hasNext()){
                radius = infile.nextDouble();
                temp = new Circle(radius);
                circleAL.add(temp);
            }
            infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }
    }
    public static void printCircles(ArrayList<Circle> circleAL){
        for(Circle c : circleAL){
            System.out.println("Radius : "+c.getRadius());
            System.out.println("Area : "+String.format("%.2f",c.area()));
            System.out.println("Circumference : "+String.format("%.2f",c.circumference()));
            System.out.println();
        }
    }
}
