package com.revoltcode.CodilityTest;

public class BinaryGap {

	public int solution(int n) {
		
		String binaryString = Integer.toBinaryString(n); 
		System.out.println("Binary Stirng - "+binaryString);
		
		boolean started = false;
		int counter = 0, maxCount = 0;
		
		for (int i = 0; i<binaryString.length(); i++) {
			String c = binaryString.substring(i, i+1);
			
			if(c.equals("1")) {
				if(started) {
					maxCount = (counter > maxCount)? counter : maxCount;
				}
				
				started = true;
				counter = 0;
			}else if(c.equals("0")) {
				counter++;
			}
		}
		return maxCount;
	}
	
	public static void main(String[] args) {
		BinaryGap binaryGap = new BinaryGap();
		
		System.out.println("Mnaximum Binary Gap -"+binaryGap.solution(21));
	}
}


