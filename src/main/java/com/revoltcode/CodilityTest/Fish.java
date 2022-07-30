package com.revoltcode.CodilityTest;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {

        int survivals = 0;
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < A.length; i++) {
            int fish = A[i];
            int fishDirection = B[i];

            if(fishDirection == 0){
                boolean fishSurvives = true;
                while(!stack.isEmpty()) {
                    int oppFish = stack.pop();
                    if(oppFish > fish){
                        stack.push(oppFish);
                        fishSurvives = false;
                        break;
                    }
                }
                if(fishSurvives) survivals++;
            }else{
                stack.push(fish);
            }
        }
        survivals += stack.size();
        return survivals;
    }

    public static void main(String[] args) {
        System.out.println(new Fish().solution(
                new int[] {4,3,2,1,5},
                new int[] {0,1,0,0,0}
        ));
    }
}
