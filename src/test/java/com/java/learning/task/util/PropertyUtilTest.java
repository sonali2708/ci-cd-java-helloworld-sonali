package com.java.learning.task.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class PropertyUtilTest {
	private static final String ANY_WRONG_KEY = "any wrong key";

	@Test
	public void testGetProperties_successful() throws IOException {
		Properties props = PropertyUtil.getInstance().getProperties(PropertyUtil.CONFIG_PROPERTIES);
		assertNotNull(props);
	}
	
	@Test
	public void testGetPropertyValue_successful() throws IOException {
		Properties props = PropertyUtil.getInstance().getProperties(PropertyUtil.CONFIG_PROPERTIES);
		assertNotNull(props);
		String propertyValue = PropertyUtil.getInstance().getPropertyValue(props,PropertyUtil.MAX_INPUT_NUMBER);
		assertNotNull(propertyValue);
	}
	
	@Test
	public void testGetPropertyValue_returns_null_value_when_provided_wrong_key() throws IOException {
		Properties props = PropertyUtil.getInstance().getProperties(PropertyUtil.CONFIG_PROPERTIES);
		assertNotNull(props);
		String propertyValue = PropertyUtil.getInstance().getPropertyValue(props,ANY_WRONG_KEY);
		assertNull(propertyValue);
	}
}
