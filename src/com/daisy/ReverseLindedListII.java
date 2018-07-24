package com.daisy;

public class ReverseLindedListII {

    public ListNode ReverseBetween(ListNode head, int m, int n){
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i=0; i<m-1; i++){
            pre = pre.next;
        }

        ListNode start = pre.next;
        ListNode then = start.next;

        for(int i=0; i<n-m; i++){
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        return dummy.next;

    }
    public static ListNode reverse(ListNode head, int m, int n){
        ListNode pre = null;
        while(head != null && m < n){
            m++;
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    public static void main(String[] args){

    }

}
