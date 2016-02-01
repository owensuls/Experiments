package com.suls.owen;

import java.util.Random;

public class ShuffleArray {

	public void shuffle(int[] input) {
		
		int temp;
		
		for (int i = 0; i < input.length; i++) {
			temp = randomGenerator(input.length);
			input[i] = input[temp];
			System.out.print(input[i] + ", ");
		}
	}
	
	private int randomGenerator(int i) {
		
		Random random = new Random();
		int number = random.nextInt(i);
		return number;
	}
}
