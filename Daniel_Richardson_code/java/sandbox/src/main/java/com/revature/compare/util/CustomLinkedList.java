package com.revature.compare.util;
/**
 * This is a custom implementation of a linked list data
 * structure, which vaguely mirrors the Java Collections
 * API implementation LinkedList.
 *
 * @param <T> a parameterized type
 * @author Wezley Singleton
 */
public class CustomLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    //inserts a new node, containing provided data, at the tail
    public void insert(T data){
        //creating a new node object
        //whose nextNode value is: null
        //and contains provided data
        Node<T> newNode = new Node<>(data, null);

        //if head is null, new node will become the head AND tail
        if(this.head == null){
            System.out.println("List is empty. Adding first element.");
            this.head = newNode;
        }
        //if elements already in
        //select tail, setting its newnode value to the newNode we just made
        else {
            System.out.println("List element exists, adding new node at end");
            tail.setNextNode(newNode);
        }
        this.tail = newNode;

    }

    //returns, NOT REMOVING, data of the first element of the list
    public T peek(){
        if(head !=null){ //ensures theres at least something there
            return head.getData(); //chambered return
        }
        return null;
    }

    //returns AND removes data of first node on list
    public T poll(){
        if(head !=null){
            T data = head.getData();
            head = head.getNextNode();
            //tail = tail.getNextNode();
//            if(head.getData().equals(null)){
//                tail.setData(null);
//            }
            return data;
        }
        return null;
    }

    //for convenience , printing lists
    public void printList(){
        //start with head
        Node<T> currentNode = this.head;
        while(currentNode != null){

            System.out.println("Node: "+ currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }

    public void removeDups(){
        Node<T> currentNode = this.head;
        while(currentNode != null){
            //System.out.println("Node: "+ currentNode.getData());
            T targetData = currentNode.getData();

            while(currentNode != null){
                if(currentNode.getData().equals(targetData)){
                    System.out.println("FOUND DUP"+currentNode.getData());
                    //deleteNode(currentNode);
                }
                currentNode = currentNode.getNextNode();
            }
            //if
            currentNode = currentNode.getNextNode();
        }
    }
    public void deleteNode(Node T){
        T = T.getNextNode();
        System.out.println(T.getData()+"Deleted");
    }


}
