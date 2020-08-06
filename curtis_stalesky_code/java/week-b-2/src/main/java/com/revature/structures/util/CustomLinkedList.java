package com.revature.structures.util;
/**
* This is a custom implementation of a linked list data
*
* */


public class CustomLinkedList<T> {

        /**
        * The starting, or root, node of our Linked List
        * */
        private Node<T> head;

        /**
        * The ending, or last, node of our linked list
        * */
        private Node<T> tail;

        /**
         Inserts a new node, containing provided data, at the
         end/tail of the linked list.
         */

        public void insert(T data)
        {
            // Create a new Node object, whose next node value
            // is null and contains the provided data
            Node<T> newNode = new Node<>(data, null);

            // If the head of our list is null, then the new Node will become the head and tail
            if (head == null)
            {
                System.out.println("List is empty, adding first element");
                head = newNode;
            }
            // If there is already elements in our list, then we will select the tail, setting its next node
            // value to the newNode we just created
            else
                {
                    System.out.println("List has existing elements, adding new node to the end.");
                    tail.setNextNode(newNode);
                }
            tail = newNode;

        }

        /**
            Returns, but does not remove the data of first node of the list


         */
        public T peek() {
            if (head != null) {
                return head.getData();
            }
            return null;
        }

        /**
            Returns, and removes the data of the first node in the list
         */
        // implements the poll() from the Queue type structure
        public T poll(){

            if (head != null)
            {
                T data = head.getData();
                this.head = head.getNextNode();

                return data + head.removeByKey(); // needs a data value
            }
            return null;

            // Thought we could try and set the null value to the tail of the next node
            /*if (head == null){

               T data = head.setNextNode();
                //this.head = tail.getNextNode();

                return data;
            }*/

        }

        // convenience method for printing out our list's contents
        public void printList()
        {
            Node<T> currentNode = this.head;
            // While the current node is not null, print node info and move on to the next node
            while (currentNode != null){
                System.out.println("Node Value: " + currentNode.getData());
                currentNode = currentNode.getNextNode();
            }

        }

    /*public boolean removeByKey(T dataValue){
        if (head == dataValue)
        {
            this.head.
        }
        return false;
    }*/

}
