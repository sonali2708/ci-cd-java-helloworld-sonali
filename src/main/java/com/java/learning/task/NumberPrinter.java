package com.java.learning.task;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

import com.java.learning.task.exception.LearningTaskException;

/**
 * Class having method to print 1 to 10
 * 
 * @author sonali.m
 *
 */
public class NumberPrinter {
	private static Logger LOG = Logger.getLogger("NumberPrinter.class");

	/**
	 * Class takes an input max number and prints from 1 to printUptoMaxNumber.
	 * There is one utility class method which fetches this input value from
	 * properties file
	 * 
	 * @param printUptoMaxNumber
	 * @throws LearningTaskException
	 */
	public void printNumbers(String printUptoMaxNumber) throws LearningTaskException {
		try {
			LOG.info("Going to print numbers from 1 to " + printUptoMaxNumber);
			if (StringUtils.isNotEmpty(printUptoMaxNumber) && Integer.valueOf(printUptoMaxNumber) == 10) {
				for (int i = 1; i <= Integer.valueOf(printUptoMaxNumber); i++) {
					System.out.println("Number :" + i);
				}
			} else {
				if (LOG.isLoggable(Level.SEVERE))
					LOG.severe("Input number is not provided or its value is not equal to 10:" + printUptoMaxNumber);
				throw new LearningTaskException("Input number not provided");
			}

		} catch (Exception e) {
			throw e;
		}
	}

}
