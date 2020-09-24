package com.java.learning.task;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;

import org.junit.Test;

import com.learning.task.util.PropertyUtil;

/**
 * Tests various scenario around getValue method
 * @author sonali.m
 *
 */
public class PropertyUtilTest {

	
	private static final String TEST_KEY = "testKey";

	@Test
	public void testGetValue_finds_value_successfully() throws IOException
	{
		String maxInputNumber = PropertyUtil.getInstance().getPropertyValue(PropertyUtil.MAX_INPUT_NUMBER);
		assertNotNull(maxInputNumber);
		assertEquals("10", maxInputNumber);
	}
	
	@Test
	public void testGetValue_finds_another_test_value_successfully() throws IOException
	{
		String value = PropertyUtil.getInstance().getPropertyValue(PropertyUtil.TEST_VALUE);
		assertNotNull(value);
		assertEquals("hello", value);
	}
	
	@Test
	public void testGetValue_returns_null_where_key_value_not_present_in_properties() throws IOException
	{
		String maxInputNumber = PropertyUtil.getInstance().getPropertyValue(TEST_KEY);
		assertNull(maxInputNumber);
	}
	
}
