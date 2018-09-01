package com.daisy;

import java.util.Random;

public class LinkedListRandomNode {
    ListNode h;
    Random rand;
    public LinkedListRandomNode(ListNode head) {
        this.h = head;
        rand = new Random();
    }

    public int getRandom() {
        ListNode dummy = h;
        int count = 0;
        while(dummy != null){
            dummy = dummy.next;
            count++;
        }
        int index= rand.nextInt(count);
        ListNode res = h;
        while(index>0){
            res = res.next;
            index--;
        }
        return res.val;
    }
}
