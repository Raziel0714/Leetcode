package com.daisy;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode mid = findMiddle(head);
        mid = reverseList(mid);
        while(mid != null && head != null){
            if(mid.val != head.val){
                return false;
            }
            mid = mid.next;
            head = head.next;
        }
        return true;

    }

    public static ListNode findMiddle(ListNode h){
        ListNode slow = h;
        ListNode fast = h.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode reverseList(ListNode h){
        if(h == null || h.next == null) return h;
        ListNode pre = null;
        while(h != null){
            ListNode cur = h.next;
            h.next = pre;
            pre = h;
            h = cur;
        }
        return pre;
    }

    public static void main(String[] args){
        ListNode s1 = new ListNode(0);
        ListNode s2 = new ListNode(0);
        s1.next = s2;
        ListNode mid = findMiddle(s1);
        System.out.println(isPalindrome(s1));

    }
}
