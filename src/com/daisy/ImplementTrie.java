package com.daisy;

public class ImplementTrie {
    class TrieNode {
        private TrieNode[] links = new TrieNode[26];
        private boolean isEnd;
    }

    private TrieNode root = new TrieNode();

    //insert
    public void insert(String word){
        TrieNode node = root;
        for(int i = 0; i<word.length(); i++){
            char cur = word.charAt(i);
            if(node.links[cur-'a'] == null)
                node.links[cur-'a'] = new TrieNode();
            node = node.links[cur-'a'];
        }
        node.isEnd = true;
    }

    //return if the word is in the trie
    public boolean search(String word){
        TrieNode node = root;
        for(int i=0; i<word.length(); i++){
            char cur = word.charAt(i);
            if(node.links[cur-'a'] == null) return false;
            node = node.links[cur-'a'];
        }
        return node.isEnd;
    }

    public boolean startsWith(String prefix){
        TrieNode node = root;
        for(int i=0; i<prefix.length(); i++){
            char cur = prefix.charAt(i);
            if(node.links[cur-'a'] == null) return false;
            node = node.links[cur-'a'];
        }
        return true;
    }
}
