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
      Node<T> newNode = new Node<>();
      newNode.setData(item);
      newNode.setNext(this.head);
      this.head = newNode;
    }


    public void addLast(T item){
        if(head == null){
            addFirst(item);
        }
        else {
            Node<T> newNode = new Node<>(null,item);
            Node<T> tmp = head;
            while (tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }


    public void insertAfterNode(T key, T item){


        Node<T> tmp = head;
        while(tmp != null && !tmp.getData().equals(key)){
            tmp = tmp.getNext();
        }
        if(tmp != null){
            Node<T> newNode = new Node<>(tmp.getNext(),item);
            tmp.setNext(newNode);
        }
    }


    public boolean removeNode(T key) {
       if(head == null) return  false;
       if(head.getData().equals(key)){
           this.head = head.getNext();
       }
       Node<T> prev = null;
       Node<T> cur = head;

       while (cur != null && !cur.getData().equals(key)){
           prev = cur;
           cur = cur.getNext();
       }
       if(cur == null){
           return  false;
       }
       prev.setNext(cur.getNext());
       return true;
    }
}
