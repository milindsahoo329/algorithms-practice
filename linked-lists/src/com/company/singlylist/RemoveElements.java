package com.company.singlylist;

public class RemoveElements {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        ListNode temp = head, prev = null;
        while(temp != null){
            if(temp.val == val){
                if(temp == head){
                    head = head.next;
                } else {
                    prev.next = temp.next;
                }
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
        return head;

    }

}
