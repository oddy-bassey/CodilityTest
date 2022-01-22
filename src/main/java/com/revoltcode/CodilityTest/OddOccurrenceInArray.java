package com.revoltcode.CodilityTest;

import java.util.HashSet;

public class OddOccurrenceInArray {

	public int getOddArray(int[] data) {
		
		HashSet<Integer> resultSet = new HashSet<>();
		
		for(int i=0; i<data.length; i++) {
			int value = data[i];
			
			if(resultSet.contains(value)) {
				resultSet.remove(new Integer(value));
			}else {
				resultSet.add(value);
			}
		}
		
		return resultSet.iterator().next(); 
	}

	public static void main(String[] args) { 
		
		OddOccurrenceInArray ooia = new OddOccurrenceInArray();
		System.out.println(ooia.getOddArray(new int[] {9, 3, 9, 3, 9, 7, 9}));
	}
}
