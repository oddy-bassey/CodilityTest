package com.revoltcode.CodilityTest;

public class MaxProfit {

    public int solution(int[] A) {
        int maxProfit = 0;
        int cummulativeProfit = 0;

        for (int i = 1; i < A.length; i++) {
            int profitToday = A[i] - A[i-1];

            if(profitToday>maxProfit){
                maxProfit = profitToday;
            }

            cummulativeProfit += profitToday;
            if(cummulativeProfit>0){
                if(cummulativeProfit>maxProfit){
                    maxProfit = cummulativeProfit;
                }
            }else{
                cummulativeProfit = 0;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(new MaxProfit().solution(new int[]
                {
                    23171,
                    21011,
                    21123,
                    21366,
                    21013,
                    21367
                }));
    }
}
