package com.revoltcode.CodilityTest;

// RPEFIX SUMS
public class GenomicRangeQuery {

	public int[] solution(String s, int[] p, int[] q) {
		
		int[][] counters = new int[3][s.length()+1];
		
		int a = 0, c =0, g = 0;
		
		for (int i=0; i<s.length(); i++) {
			String character = s.substring(i, i+1);
			
			if(character.equals("A")) {
				a++;
			}else if(character.equals("C")) {
				c++;
			}else if(character.equals("G")) {
				g++;
			} 
			counters[0][i+1] = a;
			counters[1][i+1] = c;
			counters[2][i+1] = g;
		}
		int[] result = new int[p.length];
		for (int i=0; i<result.length; i++) {
			int startIndex = p[i];
			int endIndex = q[i]+1;
			
			int r = 4;
			for(int j=0; j<3; j++) {
				if(counters[j][startIndex] != counters[j][endIndex]) {
					r = j+1;
					break;
				}
			}
			result[i] = r;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		GenomicRangeQuery grq = new GenomicRangeQuery();
		int[] result = grq.solution("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6});
		
		for(int i : result) {
			System.out.print(i);
		}
	}
}
