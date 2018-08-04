package com.daisy;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode cur = head;

        while(cur.next != null){
            if(cur.val <= cur.next.val){
                cur = cur.next;
            }else{
                ListNode temp = cur.next;
                ListNode helper = dummyhead;
                cur.next = cur.next.next;

                while(helper.next.val < temp.val){
                    helper = helper.next;
                }
                temp.next = helper.next;
                helper.next = temp;
            }
        }
        return dummyhead.next;
    }
}
