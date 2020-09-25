package com.java.learning.task;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.java.learning.task.exception.LearningTaskException;
import com.java.learning.task.util.PropertyUtil;

/**
 * Test class tests various scenarios of print method printing 1 to 10
 * 
 * @author sonali
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumberPrinterTest {

	private static final String FOURTEEN = "14";
	private static final String NUMBER = "Number :";
	private NumberPrinter numberPrinter = new NumberPrinter();
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	public void testPrintNumbers_prints_1to10_successfully() throws LearningTaskException, IOException {
		Properties props = PropertyUtil.getInstance().getProperties(PropertyUtil.CONFIG_PROPERTIES);
		PropertyUtil.getInstance().getPropertyValue(props, PropertyUtil.MAX_INPUT_NUMBER);
		numberPrinter.printNumbers(PropertyUtil.getInstance().getPropertyValue(props, PropertyUtil.MAX_INPUT_NUMBER));
		for (int i = 1; i <= 10; i++) {
			assertEquals(true, outputStreamCaptor.toString().trim().contains(NUMBER + i));
		}
	}

	@Test(expected = Exception.class)
	public void testPrintNumbers_when_max_input_number_is_not_10() throws LearningTaskException {
		numberPrinter.printNumbers(FOURTEEN);
	}

	@Test(expected = Exception.class)
	public void testPrintNumbersFails_when_input_number_provided_is_null() throws LearningTaskException {

		numberPrinter.printNumbers(null);
	}

	@Test(expected = Exception.class)
	public void testPrintNumbersFails_when_input_number_provided_is_empty() throws LearningTaskException {

		numberPrinter.printNumbers(StringUtils.EMPTY);
	}

	@After
	public void tearDown() {
		System.setOut(standardOut);
	}

}
