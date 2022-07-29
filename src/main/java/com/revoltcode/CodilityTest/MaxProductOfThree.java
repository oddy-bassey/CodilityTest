package com.revoltcode.CodilityTest;

public class MaxProductOfThree {

    int[] smallestValues = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
    int[] largestValues = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

    public int solution(int A[]) {
        for (int i : A) {
            considerLargest(i);
            considerSmallest(i);
        }

        int product1 = largestValues[0] * largestValues[1] * largestValues[2];
        int product2 = largestValues[0] * smallestValues[0] * smallestValues[1];

        return Math.max(product1, product2);
    }

    private void considerSmallest(int a){
        if(a < smallestValues[0]){
            smallestValues[1] = smallestValues[0];
            smallestValues[0] = a;
        }else if (a < smallestValues[1]){
            smallestValues[1] = a;
        }
    }

    private void considerLargest(int a){
        if(a > largestValues[0]){
            largestValues[2] = largestValues[1];
            largestValues[1] = largestValues[0];
            largestValues[0] = a;
        }else if (a > largestValues[1]){
            largestValues[2] = largestValues[1];
            largestValues[1] = a;
        }else if (a > largestValues[2]){
            largestValues[2] = a;
        }
    }

    public static void main(String[] args) {
        MaxProductOfThree mpot = new MaxProductOfThree();
        System.out.println(mpot.solution(new int[] {-3,1,2,-2,5,6}));
    }
}
