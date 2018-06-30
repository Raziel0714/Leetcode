package com.daisy;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val){
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        if(cur.next == null) return head;
        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
