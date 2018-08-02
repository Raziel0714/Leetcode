package com.daisy;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head){
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;

        while(fast.next != null || fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                while(entry != slow){
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }
        return null;
    }
}
