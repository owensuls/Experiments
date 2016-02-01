package com.suls.owen.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.suls.owen.DataStructures;

public class DataStructuresTest {

	@Test
	public final void DataStructuresHashMapExample() {
		DataStructures myDataStructures = new DataStructures();
		String expected = "Emma";
		
		String actual = myDataStructures.hashMapExample();
		
		assertEquals(expected, actual);
	}	
}
