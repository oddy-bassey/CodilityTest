package com.revoltcode.CodilityTest;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {

        int blockCount = 0;
        Stack<Integer> wall = new Stack<>();

        for (int block : H) {
            while(!wall.isEmpty() && wall.peek() > block){
                wall.pop();
            }
            if(!wall.isEmpty() && wall.peek() == block){

            }else{
                wall.push(block);
                blockCount++;
            }
        }
        return blockCount;
    }

    public static void main(String[] args) {
        System.out.println(new StoneWall().solution(new int[] {8,8,5,7,9,8,7,4,8}));
    }
}
