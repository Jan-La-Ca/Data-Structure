package com.example.demo.LinkedList;

public class LinkList<T> {

    private Node<T> head;

    public LinkList() {
        this.head = null;
    }

    public void tranverse(){
       Node<T> tmp = head;
       while (tmp != null){
           System.out.println(tmp.getData());
           tmp = tmp.getNext();
       }
    }

    public void addFirst(T item){
        Node<T> newNode = new Node<>(this.head,item);
        this.head = newNode;
    }


    public void addLast(T item){
        Node<T> newNod = new Node<>(null,item);
        if(head == null) addFirst(item);
        else {
            Node<T> tmp = head;
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(newNod);
        }

    }

}
