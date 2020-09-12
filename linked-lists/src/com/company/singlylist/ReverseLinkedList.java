package com.company.singlylist;

public class ReverseLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Recursive Solution

    public ListNode reverseList(ListNode head) {
        return reverse(head,null);
    }

    public ListNode reverse(ListNode head, ListNode newHead) {
        if(head == null)
            return newHead;

        ListNode next = head.next;
        head.next = newHead;

        return reverse(next,head);
    }

    // Iterative solution

    public ListNode reverseListIteratively(ListNode head) {

        ListNode newHead = null;

        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;
    }

}
