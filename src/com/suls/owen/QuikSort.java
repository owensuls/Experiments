package com.suls.owen;

public class QuikSort {
	
	public Integer[] sort(Integer[] arrayIn) {
		
		int temp = 0;
		int index = 0;
	
		for (int pivot = arrayIn.length - 1; pivot >= 0; pivot--) {
			for (int currentElement = 0; currentElement < arrayIn.length; currentElement++) {
				if (arrayIn[currentElement] > arrayIn[pivot]) {
					; 
				}
				else {
					temp = arrayIn[index];
					arrayIn[index] = arrayIn[currentElement];
					arrayIn[currentElement] = temp;
				}
			}
			index++;
		}
		
		return arrayIn;
	}
}
