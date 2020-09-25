package com.java.learning.task.util;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class PropertyUtilTest {
	@Test
	public void testGetProperties() throws IOException {
		Properties props = PropertyUtil.getInstance().getProperties(PropertyUtil.CONFIG_PROPERTIES);
		assertNotNull(props);
	}
	
	@Test
	public void testGetPropertyValue() throws IOException {
		Properties props = PropertyUtil.getInstance().getProperties(PropertyUtil.CONFIG_PROPERTIES);
		assertNotNull(props);
		PropertyUtil.getInstance().getPropertyValue(props,PropertyUtil.MAX_INPUT_NUMBER);
	}
}
