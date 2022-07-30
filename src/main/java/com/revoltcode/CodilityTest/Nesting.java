package com.revoltcode.CodilityTest;

public class Nesting {

    public int solution(String s) {
        int counter = 0;

        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == '(') counter++;
            else counter--;

            if(counter<0) return 0;
        }
        return (counter == 0)? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new Nesting().solution("(()(())())"));
    }
}
