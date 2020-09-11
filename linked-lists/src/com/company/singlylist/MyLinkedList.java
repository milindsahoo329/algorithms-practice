package com.company.singlylist;

class MyLinkedList {

    /** Initialize your data structure here. */

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public MyLinkedList() {
        head = null;
    }

    //** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {

        if(head != null){
            Node temp = head;
            int i = 0;
            while(i < index){
                temp = temp.next;
                i++;
            }
            if(temp != null)
                return temp.data;
            else
                return -1;
        } else {
            return -1;
        }



    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

        Node temp = new Node(val);
        temp.next = head;
        head = temp;

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

        if(head != null){
            Node next = head;
            Node prev = head;
            for(int i=0; i<index && next != null; i++){
                prev = next;
                next = next.next;
            }

            Node temp = new Node(val);

            if(index == 0) {
                temp.next = next;
                head = temp;
            } else {
                prev.next = temp;
                temp.next = next;
            }

        }else{
            if(index == 0)
                head = new Node(val);
        }


    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(head != null && head.next != null){
            Node next = head;
            Node prev = head;


            for(int i=0; i<index && next != null; i++){
                prev = next;
                next = next.next;
            }

            if(next != null)
                next = next.next;

            if(index != 0){
                prev.next = next;
            } else {
                head = next;
            }

        }
    }

    public void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

