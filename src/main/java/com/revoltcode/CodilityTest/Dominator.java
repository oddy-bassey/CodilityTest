package com.revoltcode.CodilityTest;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public int solution(int[] A) {
        if(A.length==0) return -1;

        Map<Integer, Integer> counters = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            int value = A[i];
            if(!counters.containsKey(value)){
                counters.put(value, 1);
            }else {
                counters.put(value, counters.get(value)+1);
            }
            if(counters.get(value) > A.length/2) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Dominator().solution(new int[] {3,4,3,2,3,-1,3,3}));
    }
}
