package com.daisy;

public class AddBinary {

    private static String addBin(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        System.out.println(i+" "+j);
        int remainder = 0;
        while(i >= 0 || j >= 0){
            int sum = remainder;
            if(i >= 0) sum += a.charAt(i) - '0';
            i--;
            if(j >= 0) sum += b.charAt(j) - '0';
            j--;
            sb.append(sum%2);
            remainder = sum / 2;
        }
        if(remainder != 0){
            sb.append(remainder);
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args){
        System.out.println(addBin("11","1"));
    }

}
