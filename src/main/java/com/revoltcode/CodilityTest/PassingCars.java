package com.revoltcode.CodilityTest;

public class PassingCars {

    public static void main(String[] args){
        PassingCars pc = new PassingCars();
        System.out.println(pc.solution(new int[] {0,1,0,1,1}));
        System.out.println(pc.solution(new int[] {0}));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int eastBoundCars = 0;
        int passingCars = 0;
        for(int n : A){
            if(n == 0) eastBoundCars+=1;
            else passingCars+=eastBoundCars;

            if(passingCars>1000000000) return -1;
        }

        return passingCars;
    }
}
