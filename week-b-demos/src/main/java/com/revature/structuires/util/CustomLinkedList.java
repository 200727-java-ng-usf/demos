package com.revature.structuires.util;

public class CustomLinkedList<T> {
    /**
     * The starting, or root, node of our linked list.
     */
    private  Node<T> head;
    private  Node<T> tail;

    public void insert(T data) {


        Node<T> newNode = new Node<>(data,null);  // create a node object

        if(this.head == null){ //if head is null tail and head are null
            System.out.println("List is empty, adding first element");
            head = newNode;
            tail = newNode;
        }
        else {
            System.out.println("list has existing elements, adding new node to the end.");
            tail.setNextNode(newNode);
            tail=newNode;
        }


    }
    /**
     * peek() method return but does not delete
     */
    public T peek(){
        if (head == null){ head=null;
        }
        if(head != null){
            return head.getData();  // if head has the element show it !
        }
        return null;
    }

    /**
     * poll()  return and delete;  take the first element and delete
     */
    public T poll(){
        if(head != null){
            T data = head.getData();
            head = head.getNextNode();
            return data;
        }
        return null;
    }

    /**
     * print the contents
     */
 public void printList(){
     Node<T> current = this.head;

     while (current!=null){
         System.out.println("Node value: " + current.getData());
         current = current.getNextNode();
     }

 }
}
