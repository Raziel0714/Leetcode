package com.daisy;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens){
        if(tokens.length == 0 || tokens == null) return 0;
        int a,b;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                stack.add(stack.pop() + stack.pop());
            }else if(tokens[i].equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a - b);
            }else if(tokens[i].equals("*")){
                stack.add(stack.pop() * stack.pop());
            }else if(tokens[i].equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a / b);
            }else{
                stack.add(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }
}
