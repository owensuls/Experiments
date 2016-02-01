package com.suls.owen.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.suls.owen.QuikSort;

public class QuikSortTest {

	@Test
	public final void quiksortSimpleTest() {
		
		QuikSort quiksort = new QuikSort();
		
		Integer[] arrayIn = { 6, 5, 1, 2 };
		Integer[] expected = { 1, 2, 5, 6 };
		
		quiksort.sort(arrayIn);
		
		assertArrayEquals(arrayIn, expected);
	}
}