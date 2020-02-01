package com.collectionServiceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.collectionProject.MimicSetUsingArray;

public class MimicSetUsingArrayTest {
	private MimicSetUsingArray mArray;
	
	@BeforeEach
	public void setup() {
		mArray = new MimicSetUsingArray();
	}

	@Test
	public void testAddElementSuccessCase() {
		int id  = mArray.add("ashoksilwal");
		assertEquals(id,0);
	}

	@Test
	public void testGetAddedElementSuccessCase() {
		int index = mArray.add("anilsilwal");
		assertEquals("anilsilwal",mArray.get(index));
	}
	
	@Test
	public void testRemoveAddedElementSuccessCase() {
		int index = mArray.add("anilsilwal");
		mArray.remove(mArray.get(index));
		assertNull(mArray.get(index));
	}
	
}
