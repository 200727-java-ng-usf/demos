package com.revature.structures.util;

public class CustomLinkedList<T> {

    /**
     * the starting or  root node of our linked list.
     */
    private Node<T> head;
    /**
     *
     */
    private Node<T> tail;

    /**
     * inserts provided data at the tail of linked list
     */

    public void insert(T data){
        // create a new node object, whose nex node value is null
        // and contains provided data

        Node<T> newNode = new Node<>(data,null);

        //if the head our list is null thejn the new node will be the head and tail of list

        if (head == null){
            System.out.println("List is empty adding the first element");
            head = newNode;
        }
        // if there is already elements in our list, then we wwill select the tail, setting its newNode
        //value to the nnewNode we just created
        else {
            System.out.println("list has existing elements, adding new code to the end");
            tail.setNextNode(newNode);
            tail = newNode;
        }
        /**
         *
         */


        }
    public T peek(){
        if (head != null){
            return head.getData();
        }
        return null;
    }

    public T poll(){
        if(head!=null){
            T data = head.getData();
            head = head.getNextNode();
            return data;
        }
        return null;
    }
    public void printList(){

        Node<T> currentNode = this.head;

        while(currentNode != null){
            System.out.println("node value: "+ currentNode.getData());
            currentNode = currentNode.getNextNode();
        }

    }


}
