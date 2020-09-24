package com.java.learning.task;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.java.learning.task.exception.LearningTaskException;

/**
 * This class is having functionality to calculate the area of the triangle
 * using the triangle object provided as input.
 * 
 * @author sonali.m
 *
 */
public class TriangleAreaCalculator {
	private static Logger LOG = Logger.getLogger("TriangleAreaCalculator.class");

	/**
	 * This method calculates the area of the triangle provided as input using the
	 * base & height of the triangle If the required parameter is missing it throws
	 * error message
	 * 
	 * @param triangle
	 * @return
	 * @throws LearningTaskException
	 */
	public Float area(Triangle triangle) throws LearningTaskException {
		long startTime = System.currentTimeMillis();
		LOG.info("area() calculation starts...");
		if (triangle == null || triangle.getBase() == null || triangle.getHeight() == null) {
			if (LOG.isLoggable(Level.SEVERE)) {
				LOG.severe("Missing required fields:" + triangle);
			}
			LOG.info("area() calculation ends...  : Time taken" + (System.currentTimeMillis() - startTime));
			throw new LearningTaskException("Missing required fields(height/base) of the triangle."+triangle);
		}
		Float result = (triangle.getBase() * triangle.getHeight()) / 2.0f;
		LOG.info("Successfully calculated the area of the triangle:"+result);
		LOG.info("area() calculation ends...  : Time taken" + (System.currentTimeMillis() - startTime));
		return result;
	}
}
