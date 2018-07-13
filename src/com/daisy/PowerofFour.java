package com.daisy;

public class PowerofFour {
    public static boolean isPowerOfFour(int num){
        if(num < 1) return false;
        if((num & (num-1)) != 0) return false;
        //0x55555555 represent 01010101.....
        if((num & 0x55555555) == 0) return false;
        return true;
    }


    public static void main(String[] args){
        System.out.println(isPowerOfFour(16));
        System.out.println(Integer.toBinaryString(0x55555555));
    }
}
