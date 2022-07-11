package com.basics.java.assignment10;

public class SList<T>{
    Node<T> head;
    public SList(){
        this.head=null;
    }
    public SList(T data){
        this.head = new Node(data);
    }
    public SListIterator<T> iterator() {
        return new SListIterator<T>(head);
    }
    public String toString(SListIterator s){
        Node temp=s.head;
        StringBuilder sb=new StringBuilder();
        while(temp!=null){
            sb.append(temp.data);
            if (temp.next!=null) {
                sb.append("->");
            }
            temp=temp.next;
        }
        return sb.toString();
    }
}
