package com.basics.java.javaoreilly.chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList;
        rectangleList = new ArrayList<>();
        fillArrayList(rectangleList);
        printRectangles(rectangleList);
    }
    public static void fillArrayList(ArrayList<Rectangle> rectangleAL){
        Scanner infile;
        try {
            Rectangle temp;
            double length;
            double width;
            infile = new Scanner(new File("rectangle_data.txt"));
            while (infile.hasNext()){
                length = infile.nextDouble();
                width = infile.nextDouble();
                temp = new Rectangle(length,width);
                rectangleAL.add(temp);
            }
            infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }
    }
    public static void printRectangles(ArrayList<Rectangle> rectangleAL){
        for(Rectangle r : rectangleAL){
            System.out.println("Length : "+r.getLength());
            System.out.println("Width : "+r.getWidth());
            System.out.println("Area : "+r.area());
            System.out.println("Perimeter : "+r.perimeter());
            System.out.println();
        }
    }
}
