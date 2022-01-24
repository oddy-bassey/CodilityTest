package com.revoltcode.CodilityTest;
 
import java.util.HashSet; 

public class MissingInteger {

	public int solution(int[] data) {
		
		HashSet<Integer> valueSet = new HashSet();
		
		for(int i=1; i<data.length+1; i++) {
			valueSet.add(i);
		}
		
		for(int i : data) {
			valueSet.remove(new Integer(i));
		}
		return valueSet.iterator().next();
	}
	
	public static void main(String[] args) {
		MissingInteger mi = new MissingInteger();
		System.out.println(mi.solution(new int[] {1,3,6,4,1,2}));
	}
}
