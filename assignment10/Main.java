package com.basics.java.assignment10;

public class Main {
    public static void main(String[] args) {
        SList sList = new SList();
        SListIterator sListIterator = sList.iterator();
        //insert elements
        sListIterator.insert(10);
        sListIterator.insert(20);
        sListIterator.insert(30);
        sListIterator.remove(40);
        System.out.println(sList.toString(sListIterator));
    }
}
