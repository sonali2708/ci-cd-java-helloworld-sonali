package com.java.learning.task;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.java.learning.task.exception.LearningTaskException;

/**
 * Tests different scenario around triangle area calculation
 * 
 * @author sonali
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TriangelAreaCalculatorTest {

	private TriangleAreaCalculator triangleAreaCalculator = new TriangleAreaCalculator();
	
	@Test
	public void testTriangleArea_calculation_successful() throws LearningTaskException
	{
		Triangle triangle = new Triangle(5f,12f);
		Float result = triangleAreaCalculator.area(triangle);
		assertNotNull(result);
		assertEquals( 30.0f, result, 0.0);
	}
	
	@Test(expected = Exception.class)
	public void testTriangleArea_calculation_fails_no_input() throws LearningTaskException
	{
		Float result = triangleAreaCalculator.area(null);
		assertNotNull(result);
		assertEquals( 30.0f, result, 0.0);
	}
	
	@Test(expected = Exception.class)
	public void testTriangleArea_calculation_fails_when_height_is_not_provided() throws LearningTaskException
	{
		Float height = null;
		Triangle triangle = new Triangle(height, 14f);
		Float result = triangleAreaCalculator.area(triangle);
		assertNotNull(result);
		assertEquals( 30.0f, result, 0.0);
	}
	
	@Test(expected = Exception.class)
	public void testTriangleArea_calculation_fails_when_base_is_not_provided() throws LearningTaskException
	{
		Float base = null;
		Triangle triangle = new Triangle(6f, base);
		Float result = triangleAreaCalculator.area(triangle);
		assertNotNull(result);
		assertEquals( 30.0f, result, 0.0);
	}
}
