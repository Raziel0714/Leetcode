package com.daisy;

public class ConvertSortedListtoBinarySearchTree {

    public TreeNode SortedListToBST(ListNode head){
        return toBST(head, null);
    }
    public static TreeNode toBST(ListNode head, ListNode tail){
        if(head == tail) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= tail){
            fast = fast.next;
            if(fast != tail){
                fast = fast.next;
                slow = slow.next;
            }
        }

        TreeNode root = new TreeNode(slow.val);
        root.left = toBST(head, slow);
        root.right = toBST(slow.next, tail);
        return root;
    }
}
