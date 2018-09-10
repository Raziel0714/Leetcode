package com.daisy;

public class RectangleArea {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C-A) * (D-B);
        int area2 = (G-E) * (H-F);

        System.out.println(area1 +" " + area2);


        int overlapRegion = overlap(A, B, C, D, E, F, G, H);
        return area1 + area2 - overlapRegion;
    }

    private static int overlap(int A, int B, int C, int D, int E, int F, int G, int H){
        long h1 = Math.max(A, E);
        long h2 = Math.min(C, G);
        long h = h2 - h1;

        long v1 = Math.max(B, F);
        long v2 = Math.min(D, H);
        long v = v2 - v1;

        System.out.println(h + " " + v);
        if(h <= 0 || v <= 0) return 0;
        else return (int)(h*v);

    }

    public static void main(String[] args){
        System.out.println(computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1));
    }
}
