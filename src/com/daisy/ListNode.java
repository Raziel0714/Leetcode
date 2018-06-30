package com.daisy;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){ val = x;}

    @Override
    public String toString() {
        while(next!= null){
            System.out.println(val);
        }
        return "1";
    }
}
