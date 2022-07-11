package com.basics.java.assignment10;

public class Node<T>{
    T data;
    Node<T> next;
    Node(T d){
        this.data=d;
        this.next=null;
    }
}
