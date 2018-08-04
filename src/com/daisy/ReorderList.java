package com.daisy;

public class ReorderList {

    public void reorderList(ListNode head){
        if(head == null) return;
        //find the middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode temp = slow.next;
        slow.next = null;

        //reverse it
        ListNode newHead = reverseList(temp);

        //connect it
        ListNode cur = head;
        while(cur != null && newHead != null){
            ListNode temp1 = cur.next;
            ListNode temp2 = newHead.next;
            cur.next = newHead;
            newHead.next = temp1.next;
            cur = temp1;
            newHead = temp2;
        }

    }

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return;
        ListNode nextNode = head.next;
        head.next = null;
        while(nextNode != null){
            ListNode temp = nextNode.next;
            nextNode.next = head;
            head = nextNode;
            nextNode = temp;
        }
        return head;
    }

}
