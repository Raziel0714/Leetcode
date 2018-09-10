package com.daisy;

public class SuperPow {
    public static int superPow(int a, int[] b){
        if(b.length == 1 && b[0] == 1) return a % 1337;
        int ans = 1;
        a = a % 1337;
        System.out.println("a : "+a);
        if(EvenorOdd(b)){
            System.out.println("even :");
            ans = superPow(a*a, dividebyTwo(b)) % 1337;
        }else{
            System.out.println("odd :");
            ans =  (a * (superPow(a*a, dividebyTwo(b)) % 1337)) % 1337;
        }
        return ans;
    }

    public static boolean EvenorOdd(int[] b){
        return b[b.length-1] % 2 == 0;
    }

    public static int[] dividebyTwo(int[] b){
        int borrow; int[] res;
        if(b[0] >= 2) {
            res = new int[b.length];
            borrow = 0;
            for(int i= 0; i<res.length; i++){
                res[i] = (b[i] + borrow*10) / 2;
                borrow = (b[i] + borrow*10) % 2;
            }
        }
        else {
            res = new int[b.length-1];
            borrow = 1;
            for(int i= 0; i<res.length; i++){
                res[i] = (b[i+1] + borrow*10) / 2;
                borrow = (b[i+1] + borrow*10) % 2;
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[] n = {2,0,0};
        int[] res = dividebyTwo(n);
        for(int i : res){
            System.out.print(i + " ");
        }
        System.out.println(2147483647 % 1337);
        System.out.println(superPow(2147483647, n));
    }
}
