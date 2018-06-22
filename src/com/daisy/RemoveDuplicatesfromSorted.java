package com.daisy;


public class RemoveDuplicatesfromSorted {
    private static ListNode deleteDuplicates(ListNode head){
        ListNode curNode = head;
        while(curNode.next != null){
            ListNode nextNode = curNode.next;
            if(curNode.val == nextNode.val){
                nextNode = nextNode.next;
            }else{
                curNode = curNode.next;
            }
        }
        return curNode;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        head.next = head1; head1.next = head2;

        System.out.println(deleteDuplicates(head).toString());
    }

}
