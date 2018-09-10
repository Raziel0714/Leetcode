package com.daisy;

public class WaterandJugProblem {
    public static boolean canMeasureWater(int x, int y, int z){
        return x+y == z || ((x+y>z) && (z % gcd(x, y) == 0));
    }

    public static int gcd(int x, int y){
        return y == 0 ? x : gcd(y, x%y);
    }
    public static void main(String[] args){
        System.out.println(gcd(3,5));
    }
}
