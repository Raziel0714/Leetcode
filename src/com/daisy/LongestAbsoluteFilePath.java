package com.daisy;

import javafx.util.Pair;

import java.util.Deque;
import java.util.Stack;

public class LongestAbsoluteFilePath {

    public static int lengthLongestPath(String input){
        String[] elems = input.split("\n");
        int[] maxLen = new int[1];
        dfs(elems, "", new int[1], 0, maxLen);

        return maxLen[0];
    }

    private static void dfs(String[] input, String prefix, int[] index, int curLen, int[] maxLen){
        while(index[0] < input.length){
            if(input[index[0]].indexOf(prefix) != 0){
                return;
            }
            String element = input[index[0]++];
            int len = element.length() - prefix.length() + 1;
            if(element.indexOf(".") >= 0){
                maxLen[0] = Math.max(maxLen[0] , curLen + len - 1);
            }

            dfs(input, prefix+'\t', index, curLen + len, maxLen);
        }
    }

    public static int lengthLongestPathII(String input){
        String[] paths = input.split("\n");
        int[] stack = new int[paths.length+1];
        int maxLen = 0;
        for(String s : paths){
            System.out.println(s);
            int lev = s.lastIndexOf("\t") + 1;
            int curLen = stack[lev + 1] = stack[lev] + s.length() - lev + 1;
            if(s.contains(".")) maxLen = Math.max(maxLen, curLen - 1);
        }
        for(int i : stack){
            System.out.print( i + " ");
        }
        return maxLen;
    }

    public static void main(String[] args){
        String a = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        System.out.print(lengthLongestPathII(a));
    }
}
