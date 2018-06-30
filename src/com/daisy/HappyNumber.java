package com.daisy;

import java.util.LinkedList;
import java.util.List;

public class HappyNumber {

    public static boolean isHappy(int n){
        int count = 0;
        List<Integer> list = new LinkedList<Integer>();
        while( n!= 1 ){
            int sum = 0;
            while(n>0){
                count = n%10;
                n = n/10;
                sum += count*count;
            }
            n = sum;
            System.out.println("bbb:"+sum);
            if(list.contains(sum)){
                System.out.println("aaa:"+sum);
                System.out.println("list:"+list);
                return false;
            }else{
                list.add(sum);
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isHappy(19));
    }
}
