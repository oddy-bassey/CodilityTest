package com.revoltcode.CodilityTest;

public class TapeEquilibrum {

	public int solution(int[] data) {
		
		int numbersOnRight = 0, numbersOnLeft = 0, minDif = Integer.MAX_VALUE;
		System.out.println("data : "+minDif);
		
		for (int i = 0; i < data.length; i++) {
			numbersOnRight += data[i];
		}
		
		for (int i = 0; i < data.length-1; i++) {
			numbersOnRight -= data[i];
			numbersOnLeft += data[i];
			
			if(Math.abs(numbersOnLeft-numbersOnRight) < minDif) {
				minDif = Math.abs(numbersOnLeft-numbersOnRight) ;
			}
		}
		return minDif;
	}
	
	public static void main(String[] args) { 
		System.out.println(new TapeEquilibrum().solution(new int[] {3,1,2,4,3}));
	}
}
