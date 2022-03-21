package com.basics.java.assignment10;

public class SListIterator<T> {
    Node<T> head;
    Node<T> tail;
    public SListIterator(Node<T> head){
        this.head=head;
    }
    public void insert(T data){
        if(head==null){
            head = new Node<T>(data);
            tail = head;
        }
        else{
            tail.next = new Node<T>(data);
            tail = tail.next;
        }
    }
    public void remove(T data){
        boolean found = false;
        if(head==null){
            System.out.println("Empty List, there is nothing to remove");
            return;
        }
        else if(head.data.equals(data)){
            found=true;
            head = head.next;
            if(head==null){
                tail=null;
            }
        }
        else{
            Node<T> current = head.next;
            Node<T> prev = head;
            while (current!=null){
                if(current.data.equals(data)){
                    found=true;
                    prev.next = current.next;
                }
                prev = prev.next;
                current = current.next;
            }
        }
        if(!found){
            System.out.println("The data to be removed is not found");
        }
    }
}
