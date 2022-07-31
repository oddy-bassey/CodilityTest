package com.revoltcode.CodilityTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNonDivisible {

    public int[] solution(int[] A) {

        Map<Integer,Integer> occurrence = new HashMap<>();

        for (int i : A) {
            if(occurrence.containsKey(i)){
                occurrence.put(i, occurrence.get(i)+1);
            }else{
                occurrence.put(i, 1);
            }
        }


        Map<Integer,Integer> divisorsCount = new HashMap<>();

        for (int n : occurrence.keySet()) {
            int divisorCount = 0;

            for (int val = 1; val <= Math.sqrt(n); val++) {
                if(n%val == 0){
                    if(occurrence.containsKey(val)){
                        divisorCount += occurrence.get(val);
                    }
                    if(val<Math.sqrt(n)){
                        int opp = n/val;

                        if(occurrence.containsKey(opp)){
                            divisorCount += occurrence.get(opp);
                        }
                    }
                }
            }
            divisorsCount.put(n, divisorCount);
        }

        int[] nonDivisors = new int[A.length];
        for (int i = 0; i < A.length ; i++) {
            nonDivisors[i] = A.length - divisorsCount.get(A[i]);
        }

        return nonDivisors;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountNonDivisible().solution(new int[]{3, 1, 2, 3, 6})));
    }
}
