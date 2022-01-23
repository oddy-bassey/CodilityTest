package com.revoltcode.CodilityTest;

import java.util.HashSet; 

public class PermMissingElem {

	public int getMissingEelement(int[] data) {
		
		HashSet<Integer> valueSet = new HashSet();
		
		for(int i=1; i<data.length+1; i++) {
			valueSet.add(i);
		}
		
		for(int i=0; i<data.length; i++) {
			valueSet.remove((Integer) data[i]);
		}
		
		return valueSet.iterator().next();
	}
	
	public static void main(String[] args) { 
		
		PermMissingElem pme = new PermMissingElem();
		System.out.println(pme.getMissingEelement(new int[] {2,3,1,5}));
	}
}
