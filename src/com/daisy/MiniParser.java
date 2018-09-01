package com.daisy;

import java.util.Stack;

public class MiniParser {
    public static NestedInteger deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<>();
        String temp = "";
        for(char c : s.toCharArray()){
            switch(c){
                case '[':
                    stack.push(new NestedInteger());
                    break;

                case ']':
                    if(!temp.equals("")){
                        stack.peek().add(new NestedInteger(Integer.parseInt(temp)));
                        temp = "";
                    }

                    NestedInteger top = stack.pop();
                    if(!stack.empty()){
                        stack.peek().add(top);
                    }else{
                        return top;
                    }
                    break;

                case ',':
                    if(!temp.equals("")){
                        stack.peek().add(new NestedInteger(Integer.parseInt(temp)));
                        temp = "";
                    }
                    break;
                default: temp += c;
            }
        }
        if(!temp.equals("")){
            return new NestedInteger(Integer.parseInt(temp));
        }
        return null;
    }

    public static void main(String[] args){
        String s = "324";
        System.out.println(deserialize(s));
    }
}
