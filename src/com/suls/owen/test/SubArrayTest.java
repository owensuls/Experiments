package com.suls.owen.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.suls.owen.SubArray;

public class SubArrayTest {

	@Test
	public final void SubArrayCalculateMaxSumTest() {
		int actual;
		SubArray subArray = new SubArray();
		
		int[][] inputs = {
			{ 1, 2, 3, 4 },
			{ 2, 3, -1, -3 },
			{ -1, 5, 100, -1000 },
			{ -1, -2, -3, -4 },
			{ 10, 200, -1, 30000 },
			{ 1, 3, -5, 2 }
		};
		
		int[] expected = { 10, 5, 105, 0, 30210, 4 };
		
		for (int i = 0; i < inputs.length; i++) {
			actual = subArray.calculateMaxSum(inputs[i]);	
			assertEquals(expected[i], actual);
		}
	}
}
