package com.company.DoublyLinkedList;

public class DoublyLinkedListExecutor {

    public static void main(String [] args){
        MyDoublyList l1 = new MyDoublyList();
        l1.addAtHead(1);
        l1.addAtTail(3);
        l1.display();
        l1.addAtIndex(2,2);
        l1.display();

        System.out.println(l1.get(1));

//        l1.addAtIndex(3,0);
//        l1.deleteAtIndex(2);
//
//        l1.display();


//        l1.display();
//
//        System.out.println(l1.get(1));
//
//        l1.deleteAtIndex(1);
//
//        l1.display();
//
//        System.out.println(l1.get(1));

    }

}
