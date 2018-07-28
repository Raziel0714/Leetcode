package com.daisy;

import java.util.*;

public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList){
        if(!wordList.contains(endWord)) return 0;
        if(beginWord.equals(endWord)) return 1;
        //Set<String> set = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        int len = 2;
        queue.offer(beginWord);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                String temp = queue.poll();
                for(int j=0; j<temp.length(); j++){
                    StringBuilder sb = new StringBuilder(temp);
                    for(char k = 'a'; k<= 'z'; k++){
                        sb.setCharAt(j, k);
                        String cur = sb.toString();
                        if(wordList.contains(cur)){
                            if(cur.equals(endWord)) return len;
                            queue.offer(cur);
                            wordList.remove(cur);
                        }
                    }
                }
            }
            len++;
        }
        return 0;
    }

    public static void main(String[] args){
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<String>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        System.out.println(ladderLength(beginWord, endWord, wordList));
    }
}
