package com.revoltcode.CodilityTest;

public class MaxDoubleSliceProblem {

    public int solution(int[] A) {
        int[] s = new int[A.length];
        int[] e = new int[A.length];

        for (int i = 1; i < A.length-1; i++) {
            s[i] = Math.max(A[i], s[i-1]+A[i]);
            if(s[i]<0) s[i] = 0;
        }

        for (int i = A.length-2 ; i>0; i--) {
            e[i] = Math.max(A[i], e[i+1] + A[i]);
            if(e[i]<0) e[i] = 0;
        }

        int max = 0;
        for (int i = 1; i < A.length-1; i++) {
            max = Math.max(s[i-1] + e[i+1], max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaxDoubleSliceProblem().solution(new int[] {3,2,6,-1,4,5,-1,2}));
    }
}
