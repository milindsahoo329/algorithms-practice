package com.company.singlylist;

public class PalindromeList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        slow = reverseList(slow);

        fast = head;

        while(slow != null){
            if(fast.val != slow.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }


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

}
