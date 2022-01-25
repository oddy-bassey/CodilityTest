package com.revoltcode.CodilityTest;

// COUNTING ELEMTENS SECTION
public class MaxCounters {

	public int[] solution(int n, int[] array) {
		
		int maxValue = 0, minValue = 0;
		int[] counters = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			
			int operation = array[i];
			
			if(operation == n+1) {
				// max value operation
				minValue = maxValue;

			}else {
				// increment operation
				
				operation--;
				counters[operation] = Math.max(counters[operation]+1, minValue+1);
				maxValue = Math.max(maxValue, counters[operation]);
			}
		}
		
		for (int i = 0; i < counters.length; i++) {
			counters[i] = Math.max(counters[i], minValue);
		}
		
		return counters;
	}
	
	public static void main(String[] args) {
		
		MaxCounters maxCounters = new MaxCounters();
		
		int[] result = maxCounters.solution(5, new int[] {3,4,4,6,1,4,4});
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
