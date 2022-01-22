package com.revoltcode.CodilityTest;

import java.util.Arrays;

public class CyclicRotation {

	public int[] mySolution(int data[], int k) {
		
		while(k>0) {
			
			int currentValue = data[0] , nextValue = 0;
			for(int i=0; i<data.length; i++) {  
				if(i==0) {
					data[i] = data[data.length-1]; 
					nextValue = data[i+1];
				}else {
					data[i] = currentValue;
					currentValue = nextValue;
					nextValue = (i == data.length-1)? 0 : data[i+1];
				}
			}
			k--;
		}
		
		return data;
	}
	
	public int[] rotateArray(int data[], int k) {
		
		for (int i=0; i<k; i++) {
			int lastValue = data[data.length-1];
			
			for(int j=data.length-2; j>=0; j--) {
				data[j+1] = data[j];
			}
			data[0] = lastValue;
		}
		
		return data;
	}
	
	
	public static void main(String[] args) { 
		CyclicRotation cyclicRotation = new CyclicRotation(); 
		
		int[] result = cyclicRotation.mySolution(new int[]  {0,0,3,8,9,7,6}, 3);
		for(int i=0; i<result.length; i++) { 
			System.out.print(result[i]+" ");
		}
	}
}
