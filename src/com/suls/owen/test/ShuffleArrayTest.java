package com.suls.owen.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.suls.owen.*;

public class ShuffleArrayTest {

	@Test
	public final void ShuffleArrayTest() {
		ShuffleArray shuffleArray = new ShuffleArray();
		
		int[] input = { 4000, 1, 5, 1, 8, 8, 8, 3 };
		//int[] input = { 4000, 1 };
		
		shuffleArray.shuffle(input);
	}

}
