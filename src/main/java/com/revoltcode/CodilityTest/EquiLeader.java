package com.revoltcode.CodilityTest;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

    private int dominator;
    private int dominatorCount;

    public int solution(int[] A) {

        Map<Integer, Integer> counters = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            int value = A[i];
            if(!counters.containsKey(value)){
                counters.put(value, 1);
            }else {
                counters.put(value, counters.get(value)+1);
            }
            if(counters.get(value) > A.length/2){
                dominator = value;
                dominatorCount = counters.get(value);
            }
        }

        int equiLeaders = 0;
        int leadersInRightSide = dominatorCount;
        int countRightSide = A.length;
        int countLeftSide = 0;
        int leadersInLeftSide = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == dominator){
                leadersInRightSide--;
                leadersInLeftSide++;
            }
            countLeftSide++;
            countRightSide--;

            if(leadersInLeftSide > countLeftSide/2){
                if(leadersInRightSide > countRightSide/2){
                    equiLeaders++;
                }
            }
        }

        return equiLeaders;
    }

    public static void main(String[] args) {
        System.out.println(new EquiLeader().solution(new int[] {4,3,4,4,4,2}));
    }
}
