package com.java.learning.task;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.learning.task.exception.LearningTaskException;
import com.learning.task.util.PropertyUtil;

/**
 * Test class tests various scenarios of print method printing 1 to 10
 * 
 * @author sonali.m
 *
 */
public class NumberPrinterTest {

	private NumberPrinter numberPrinter = new NumberPrinter();
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	public void testPrintNumbers_prints_1to10_successfully() throws LearningTaskException, IOException {
		numberPrinter.printNumbers(getMaxInputNo());
		for (int i = 1; i <= 10; i++) {
			assertEquals(true, outputStreamCaptor.toString().trim().contains("Number :" + i));
		}
	}

	@Test(expected = Exception.class)
	public void testPrintNumbers_when_max_input_number_is_not_10() throws LearningTaskException {
		numberPrinter.printNumbers("14");
	}

	@Test(expected = Exception.class)
	public void testPrintNumbersFails_when_input_number_provided_is_null() throws LearningTaskException {

		numberPrinter.printNumbers(null);
	}

	@Test(expected = Exception.class)
	public void testPrintNumbersFails_when_input_number_provided_is_empty() throws LearningTaskException {

		numberPrinter.printNumbers("");
	}

	@After
	public void tearDown() {
		System.setOut(standardOut);
	}

	private String getMaxInputNo() throws IOException {
		// input max number =10 here
		String printUptoMaxNumber = PropertyUtil.getInstance().getPropertyValue(PropertyUtil.MAX_INPUT_NUMBER);
		return printUptoMaxNumber;
	}

}
