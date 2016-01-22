package com.suls.owen;

import static org.junit.Assert.*;
import org.junit.Test;
import com.suls.owen.BubbleSort;

public class BubbleSortTest {

	@Test
	public void test() {
		BubbleSort bubble = new BubbleSort();
		
		Integer[] arrayIn = { 2, 1, 0 };
		
		bubble.sort(arrayIn);
	}
}
