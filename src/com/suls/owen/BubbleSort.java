package com.suls.owen;

public class BubbleSort {
	
	public Integer[] sort(Integer[] arrayIn) {
		int temp;
		boolean swapped = false;
		
		for (int i = 0; i < arrayIn.length; i++) {
			swapped = false;
			for (int j = i + 1; j < arrayIn.length; j++) {
				if (arrayIn[i] > arrayIn[j]) {
					temp = arrayIn[i];
					arrayIn[i] = arrayIn[j];
					arrayIn[j] = temp;
					swapped = true;
				}
			}
			
			if (swapped == false) break;
		}
		
		return arrayIn;
	}
}
