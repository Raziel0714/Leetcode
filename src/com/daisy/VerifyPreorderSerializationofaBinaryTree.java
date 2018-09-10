package com.daisy;

public class VerifyPreorderSerializationofaBinaryTree {
    public static boolean isValidSerialization(String preorder) {
        String[] strs = preorder.split(",");
        int diff = 1;
        for(String node : strs){
            if(--diff < 0) return false;
            if(!node.equals("#")) diff += 2;
        }
        return diff == 0;
    }

    public static void main(String[] args){
        isValidSerialization("7,2,#,2,#,#,#,6,#");
    }
}
