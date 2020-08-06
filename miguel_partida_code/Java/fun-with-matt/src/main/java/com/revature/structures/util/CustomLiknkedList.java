package com.revature.structures.util;

  /**
This is a custom implementation of a linked list data
structure, which vaguely mirrors the Java Collections API
implementation LinkedLis

     */

public class CustomLiknkedList <T>{
    /*
    The starting, or root , node of our linked list
     */
    private Node<T> head;



    /*
  The ending, or tail-last , node of our linked list
   */
    private Node<T> tail;

    public void insert(T data){

        //create a new node object, whose nextNode value is null and contains the provided data
        Node<T> newNode = new Node<>(data, null);

        // if the head of our list is null, then the new node will become the head and the tail
        if(head ==null){
            System.out.println("List is empty adding first element");
            head = newNode;
        }
        //if there is already elements in our list, then we will select the tail, setting its nextNode
        //value to the newNode we just created
        else {
            System.out.println("LIst has existing elements, adding new node to the end");
            tail.setNextNode(newNode);
        }
        tail = newNode;
    }
    /*
    returns, but does not remove, the data of the first node in the list
     */

      public T peek(){

          if(head != null) {
              return head.getData();
          }
          return null;
      }
      /**
       * returns, and removes, the data of the first node in the list
       *
       */

      public T poll() {
          if(head != null){
              T data = head.getData();
              head = head.getNextNode();
              if(head == null){
                  tail = null;
              }
              return data;
          }
          return null;
      }
      /**
       * convenience method for printing out our lists contents
       */
      public void printList(){
          //start with the head of the list
          Node<T> currentNode = this.head;

          while (currentNode != null){
              System.out.println("Node value: " + currentNode.getData()) ;
              currentNode = currentNode.getNextNode();
          }
      }

//      public void removeDoubles(T dataValue){
//          Node<T> currentNode = head;
//          Object index,temp = null;
//          if(head == null){
//              return;
//          }else {
//              while(currentNode != null){
//                  temp = currentNode;
//                  index = currentNode.getNextNode();
//
//                  while(index != null){
//                      if(currentNode.getData() == index) {
//                          temp = index.
//
//                      }
//                  }
//
//
//              }
//
//              }
//
//
//
//      }

  }
