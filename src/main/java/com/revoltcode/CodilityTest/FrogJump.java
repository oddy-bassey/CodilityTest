package com.revoltcode.CodilityTest;

public class FrogJump {

	public int getNoPossibleJumps(int x, int y, int d) {
		
		/* where x : starting pos
		 * y : ending pos
		 * d : jump range
		*/
		
		int distance = y-x;
		int jumps = (int) Math.ceil(distance / (double)d);
		//System.out.println(" > "+distance / (double)d);
		
		return jumps;
	}

	public static void main(String[] args) { 
		FrogJump frogJump = new FrogJump();
		System.out.println(frogJump.getNoPossibleJumps(10, 10, 30));
	}
}
