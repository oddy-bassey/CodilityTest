package com.revoltcode.CodilityTest;

import java.util.Stack;

public class Brackets {

    public int solution(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length() ; i++) {
            String ch = s.substring(i,i+1);
            if(ch.equals("(") || ch.equals("[") || ch.equals("{")){
                stack.push(ch);
            }else {
                if(stack.isEmpty()) return 0;
                if(ch.equals(")")){
                    if(!stack.pop().equals("(")){
                        return 0;
                    }
                }
                if(ch.equals("]")){
                    if(!stack.pop().equals("[")){
                        return 0;
                    }
                }
                if(ch.equals("}")){
                    if(!stack.pop().equals("{")){
                        return 0;
                    }
                }
            }
        }
        if (!stack.isEmpty()) return 0;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new Brackets().solution("{[()()]}"));
    }
}
