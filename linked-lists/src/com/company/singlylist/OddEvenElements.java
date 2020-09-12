package com.company.singlylist;

public class OddEvenElements {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead = null, temp=head, evenTemp=null, oddTemp=head;

        if(head != null && head.next != null){
            evenHead = head.next;
            evenTemp = evenHead;
            temp = head.next.next;
            while(temp != null){
                oddTemp.next = temp;
                evenTemp.next = temp.next;
                oddTemp = temp;
                evenTemp = temp.next;
                temp = temp.next != null ? temp.next.next : null;
            }
            oddTemp.next = evenHead;
        }

        return head;
    }

}
