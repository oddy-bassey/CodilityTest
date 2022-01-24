package com.revoltcode.CodilityTest;

public class CountDiv {

	public int solution(int a, int b, int k) {
	
		int base = (int) Math.ceil((double) a/ k);
		base *= k;
		b -= base;
		int count = (int) Math.floor((double) b / k);
		
		count++;
		
		return count;
	}
	
	public static void main(String[] args) {
		CountDiv cd = new CountDiv();
		System.out.println(cd.solution(6, 11, 2));
	}
}
