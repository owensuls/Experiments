package com.suls.owen.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.suls.owen.BubbleSort;

public class BubbleSortTest {

	@Test
	public void bubbleSortSimpleTest() {
		BubbleSort bubble = new BubbleSort();
		
		Integer[] arrayIn = { 2, 1, 0 };
		Integer[] expected = { 0, 1, 2 };
		bubble.sort(arrayIn);
	
		assertArrayEquals(arrayIn, expected);
	}
}