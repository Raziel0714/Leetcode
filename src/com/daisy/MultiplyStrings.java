package com.daisy;

public class MultiplyStrings {

    public static String multiply(String num1, String num2){
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int[] products = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                products[i + j + 1] += ((int) num1.charAt(i) - '0') * ((int) num2.charAt(j) - '0');
            }
        }
        for(int i : products){
            System.out.print(i + " ");
        }
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = n1 + n2 - 1; i >= 0; i--) {
            int tmp = products[i] + carry;
            sb.append(tmp % 10);
            carry = tmp / 10;
        }
        sb.reverse();
        if (sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();

    }

    public static void main(String[] args){
        System.out.println();
        System.out.println(multiply("123", "456"));
    }
}
