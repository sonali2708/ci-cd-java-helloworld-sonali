package com.java.learning.task;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

import com.java.learning.task.exception.LearningTaskException;

/**
 * Class having method to print 1 to 10
 * 
 * @author sonali
 *
 */
public class NumberPrinter {
	private static Logger LOG = Logger.getLogger("NumberPrinter.class");

	/**
	 * Class takes an input max number and prints from 1 to 10. If the input number
	 * is not 10 or missing , then error message is thrown.
	 * 
	 * @param printUptoMaxNumber
	 * @throws LearningTaskException
	 */
	public void printNumbers(String printUptoMaxNumber) throws LearningTaskException {
		long startTime = System.currentTimeMillis();
		LOG.info("printNumber()... starts " + startTime);
		LOG.info("Going to print numbers from 1 to 10");
		if (StringUtils.isNotEmpty(printUptoMaxNumber) && Integer.valueOf(printUptoMaxNumber) == 10) {
			for (int i = 1; i <= Integer.valueOf(printUptoMaxNumber); i++) {
				System.out.println("Number :" + i);
			}
		LOG.info("Printed numbers from 1 to 10");
		} else {
			if (LOG.isLoggable(Level.SEVERE)) {
				LOG.severe("Input number is not provided or its value is not equal to 10:" + printUptoMaxNumber);
			}
			LOG.info("printNumber()... ends ..Time Taken: " + (System.currentTimeMillis() - startTime));
			throw new LearningTaskException("Input number not provided" + printUptoMaxNumber);
		}
		LOG.info("printNumber()... ends ..Time Taken:" + (System.currentTimeMillis() - startTime));
	}
}
