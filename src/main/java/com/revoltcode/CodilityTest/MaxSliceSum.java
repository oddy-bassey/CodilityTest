package com.revoltcode.CodilityTest;

public class MaxSliceSum {

    public int solution(int[] A) {
        long sum = Integer.MIN_VALUE;
        long maxSum = Integer.MIN_VALUE;

        for (int i : A) {
            sum = Math.max(sum+i, i);
            maxSum = Math.max(maxSum, sum);
        }
        return (int) maxSum;
    }

    public static void main(String[] args) {
        System.out.println(new MaxSliceSum().solution(new int[]{3,2,-6,4,0}));
    }
}
