package com.revoltcode.CodilityTest;

public class CommonPrimeDivisors {

    public int solution(int[] A, int[] B){

        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if(hasAllPrimeFactors(A[i], B[i]) && hasAllPrimeFactors(B[i],A[i] )){
                count++;
            }
        }

        return count;
    }

    private boolean hasAllPrimeFactors(int x, int y){

        if(y==1) return true;
        int gcd = getGcd(x,y,1);
        if(gcd == 1) return false;

        return hasAllPrimeFactors(x, y/gcd);
    }

    public int getGcd(int a, int b, int res) {

        if (a == b) {

            return res * a;

        }else if ((a % 2 == 0) && (b % 2 == 0)){

            return getGcd(a/2, b/2, 2 * res);

        }else if (a % 2 == 0){

            return getGcd(a/2, b, res);

        }else if (b % 2 == 0){

            return getGcd(a, b/2, res);

        }else if (a > b) {

            return getGcd(a - b, b, res);

        }else {

            return getGcd(a, b - a, res);

        }
    }

    public static void main(String[] args) {
        CommonPrimeDivisors cbn = new CommonPrimeDivisors();
        System.out.println(cbn.solution(
                new int[] {15, 10, 9},
                new int[] {75, 30, 5}
        ));
    }
}
