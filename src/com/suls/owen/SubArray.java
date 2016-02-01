package com.suls.owen;

public class SubArray {
	public int calculateMaxSum(int[] input) {
		int max = 0;
		
		for (int start = 0; start < input.length; start++) {
			for (int end = start; end < input.length; end++) {
				int sum = 0; 
				for (int i = start; i <= end; i++) {
					sum += input[i];
				}
				if (sum > max) {
					max = sum;
				}
			}
		}

		return max; 
	}
}