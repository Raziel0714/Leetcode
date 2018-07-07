package com.daisy;

public class ReverseLinkedList {

    private static ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode pre = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

}
