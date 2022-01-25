package com.revoltcode.CodilityTest;

import java.util.HashSet;

//COUNTING ELEMTENS SECTION
public class FrogRiverOne {

	public int solution(int x, int[] array) {
		
		HashSet<Integer> valueSet = new HashSet<>();
		for (int i = 1; i <= x; i++) {
			valueSet.add(i);
		}
		
		for (int i = 0; i < array.length; i++) {
			if(valueSet.remove(array[i])) {
				if(valueSet.isEmpty()) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		FrogRiverOne fro = new FrogRiverOne();
		
		System.out.println(fro.solution(5, new int[] {1,3,1,4,2,3,5,4}));

		System.out.println(fro.solution(1, new int[] {1}));
	}
}
