package com.daisy;

import java.util.List;

public class NestedInteger {
    int i;
    NestedInteger n;
    public NestedInteger(){}
    public NestedInteger(int value){
        i = value;
    }

    public boolean isInteger(){
        return true;
    }
    public Integer getInteger(){
        return i;
    }
    public void setInteger(int value){
        i = value;
    }
    public void add(NestedInteger ni){
        n = ni;
    }
    public List<NestedInteger> getList(){
        return null;
    }
}