package com.learning.task.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This is a utility class having utility method to fetch properties values from
 * config.properties file when provided key as input.
 * 
 * @author sonali.m
 *
 */
public final class PropertyUtil {
	public static final String MAX_INPUT_NUMBER = "max.input.number";
	private static final String CONFIG_PROPERTIES_PATH = "/config.properties";
	private static PropertyUtil prortyUtilInstance;

	public static PropertyUtil getInstance() {
		if (prortyUtilInstance == null)
			prortyUtilInstance = new PropertyUtil();
		return prortyUtilInstance;
	}

	private PropertyUtil() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public String getPropertyValue(String key) throws IOException {
		Properties prop = new Properties();
		InputStream is = this.getClass().getResourceAsStream(CONFIG_PROPERTIES_PATH);
		prop.load(is);
		return prop.getProperty(key);
	}
}
