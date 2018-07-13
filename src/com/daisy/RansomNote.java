package com.daisy;

import java.util.Arrays;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine){
        char[] ranNote = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        Arrays.sort(ranNote);
        Arrays.sort(mag);
        char[] res = new char[ranNote.length];

        int i=0, j=0, k=0;
        while(i< ranNote.length && j<mag.length){
            if(ranNote[i] == mag[j]){
                res[k++] = ranNote[i++];
                j++;
            }else{
                int t = ranNote[i] < mag[j] ? i++ : j++;
            }
        }
        for(int z=0; z<ranNote.length; z++){
            if(ranNote[z] != res[z]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "bg";
        String str2 = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println(canConstruct(str1, str2));
    }

}
