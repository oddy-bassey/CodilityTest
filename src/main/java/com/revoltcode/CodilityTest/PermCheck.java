package com.revoltcode.CodilityTest;

import java.util.HashSet;

// COUNTING ELEMENTS SECTION
public class PermCheck {

	public int solution(int[] data) {
	
		HashSet< Integer> valueSet = new HashSet<>();
		
		for (int i = 0; i < data.length; i++) {
			valueSet.add(i+1);
		}
		
		for (int x : data) {
			if(!valueSet.contains(x)) {
				return 0;
			}else {
				valueSet.remove(new Integer(x));
			}
		}
		return valueSet.isEmpty()?  1 : 0 ;
	}
	public static void main(String[] args) {
		
		PermCheck pm = new PermCheck();
		System.out.println(pm.solution(new int[] {1}));
	}
}
