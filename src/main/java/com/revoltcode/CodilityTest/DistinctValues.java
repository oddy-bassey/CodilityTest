package com.revoltcode.CodilityTest;

import java.util.HashSet;
import java.util.Set;

public class DistinctValues {

    public int solution(int A[]) {
        if(A.length == 1) return 1;
        Set<Integer> values = new HashSet<>();

        for (int n : A) {
            values.add(n);
        }

        return values.size();
    }

    public static void main(String[] args) {
        DistinctValues dv = new DistinctValues();
        System.out.println(dv.solution(new int[] {2,1,1,2,3,1}));
    }
}
