package com.daisy;

public class CompareVersionNumbers {

    public static int compareVersion(String version1, String version2){
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");

        int a = 0, b = 0;
        int index = Math.max(str1.length, str2.length);
        //check 0
        int index1 = 0;
        for(int i=0; i<str1.length; i++){
            if(!str1[i].equals("0")){
                index1 = i;
                break;
            }
        }
        for(int i=index1; i<str1.length; i++){
            a = a*10 + Integer.parseInt(str1[i]);
        }

        int index2 = 0;
        for(int i=0; i<str1.length; i++){
            if(!str2[i].equals("0")){
                index2 = i;
                break;
            }
        }

        for(int i=index2; i<str2.length; i++){
            b = b*10 + Integer.parseInt(str2[i]);
        }

        if(str1.length < index){
            a *= Math.pow(10, index - str1.length);
        }
        if(str2.length < index){
            b *= Math.pow(10, index - str2.length);
        }

        System.out.println("a:"+a+"  b:"+b);
        if(a < b) return -1;
        if(a > b) return 1;
        return 0;
    }

    public static void main(String[] args){
        String version1 = "0.1";
        String version2 = "1.0";
        System.out.println(compareVersion(version1, version2));

    }
}
