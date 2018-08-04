package com.daisy;

public class SortList {
    public ListNode sortList(ListNode head){

        if(head == null || head.next == null) return head;

        //find the middle;
        ListNode mid = findMid(head);
        ListNode secHead = mid.next;
        mid.next = null;

        //merge two ListNode;
        return mergeTwoList(sortList(head), sortList(secHead));
    }

    public static ListNode findMid(ListNode head){
        ListNode slow = head, fast = head;

        while(fast.next != null || fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode mergeTwoList(ListNode headI, ListNode headII){
        ListNode dummy = new ListNode(0);
        ListNode helper = dummy;
        while(headI != null && headII != null){
            if(headI.val <= headII.val){
                helper.next = headI;
                headI = headI.next;
                helper = helper.next;
                helper.next = null;
            }else{
                helper.next = headII;
                headII = headII.next;
                helper = helper.next;
                helper.next = null;
            }
        }
        helper.next = (headI == null)?headII : headI;
        return dummy.next;
    }

}
