package com.company.DoublyLinkedList;


public class MyDoublyList {
    class DListNode {
        int val;
        DListNode next;
        DListNode prev;
        DListNode (int val) {
            this.val = val;
        }
    }

    DListNode head;
    DListNode tail;
    /** Initialize your data structure here. */
    public MyDoublyList() {
        head = new DListNode(0);
        tail = new DListNode(0);
        head.prev = null;
        head.next = tail;
        tail.prev = head;
        tail.next = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int i = 0;
        DListNode cur = head.next;
        while (cur != tail) {
            if (i++ == index) return cur.val;
            cur = cur.next;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        DListNode node = new DListNode(val);
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        DListNode node = new DListNode(val);
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        DListNode node = new DListNode(val);
        int i = 0;
        DListNode cur = head;
        while (cur != tail) {
            if (i++ == index) {
                node.prev = cur;
                node.next = cur.next;
                cur.next.prev = node;
                cur.next = node;
                return;
            }
            cur = cur.next;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int i = 0;
        DListNode cur = head;
        while (cur != tail && cur.next != tail) {
            if (i++ == index) {
                cur.next.next.prev = cur;
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }


}
