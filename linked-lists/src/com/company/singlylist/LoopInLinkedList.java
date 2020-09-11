package com.company.singlylist;

public class LoopInLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasLoop(ListNode head) {

        if(head == null)
            return false;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer)
                return true;
        }

        return false;

    }

    public ListNode detectCycle(ListNode head) {

        if(head == null)
            return null;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer) {
                ListNode temp = head;
                while(temp!=slowPointer){
                    temp = temp.next;
                    slowPointer = slowPointer.next;
                }
                return slowPointer;
            }
        }
        return null;

    }

}
