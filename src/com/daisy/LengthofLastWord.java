package com.daisy;

import sun.security.util.Length;

public class LengthofLastWord {

    private static int Length(String s){
        return(s.trim().length()-s.trim().lastIndexOf(' '));
    }

    public static void main(String[] args){
        Length("dfsd dfsf af");
    }
}
