package com.daisy;

public class RemoveNthNodeFromEndofList {

    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        int i = 0;
        while(cur != null){
            i++;
            cur = cur.next;
        }
        i -= n;
        cur = dummy;
        while(i<n){
            i--;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        removeNthFromEnd(l1, 2);

    }
}
