package com.company.singlylist;

public class SinglyLinkedListExecutor {

    public static void main(String [] args){
        MyLinkedList l1 = new MyLinkedList();
        l1.addAtHead(1);
        l1.addAtTail(3);
        l1.addAtIndex(1,2);

        l1.display();

        System.out.println(l1.get(1));

        l1.deleteAtIndex(1);

        l1.display();

        System.out.println(l1.get(1));

    }

}
