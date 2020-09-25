package com.java.learning.task.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This is a utility class having utility methods to fetch properties values
 * from config.properties file and find the individual property value using the
 * key as input
 * 
 * @author sonali.m
 *
 */
public class PropertyUtil {
	public static final String MAX_INPUT_NUMBER = "max.input.number";
	public static final String CONFIG_PROPERTIES = "config.properties";
	public static final String TEST_VALUE = "another.test.value";
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


	/**
	 * Gets all the properties using the property file name provided as input
	 * 
	 * @param configFileName
	 * @return
	 * @throws IOException
	 */
	public Properties getProperties(String configFileName) throws IOException {
		Properties props = new Properties();
		InputStream resourceStream = getClass().getClassLoader().getResourceAsStream(configFileName);
		props.load(resourceStream);
		return props;
	}

	/**
	 * Gets the property value from the properties using the key provided as input
	 * 
	 * @param props
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyValue(Properties props, String key) throws IOException {

		return (String) props.get(key);
	}
}
