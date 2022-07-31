package com.revoltcode.CodilityTest;

public class CountFactors {

    public int solution(int N) {

        int factors = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {

            if((N%i)==0){
                if(i<Math.sqrt(N)){
                    factors += 2;
                }else{
                    factors++;
                }
            }
        }
        return factors;
    }

    // scored 71%
    public int mySolution(int N) {
        if(N==1) return 1;

        int midFactor = (int) Math.floor(N/2);
        int factors = 2;

        for (int i = 2; i <= midFactor; i++) {

            if((N/i)>0 && (N%i)==0){
                factors++;
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(new CountFactors().solution(24));
    }
}
