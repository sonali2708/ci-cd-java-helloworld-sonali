package com.java.learning.task;

/**
 * Triangle class which area we are going to calculate
 * 
 * @author sonali
 *
 */
public class Triangle {
	private Float height;
	private Float base;

	/**
	 * Constructs the triangle with object using the height and base provided as
	 * input.
	 * 
	 * @param height
	 * @param base
	 */
	public Triangle(Float height, Float base) {
		super();
		this.height = height;
		this.base = base;
	}

	/**
	 * 
	 * @return height
	 */
	public Float getHeight() {
		return height;
	}

	/**
	 * 
	 * @param height
	 */
	public void setHeight(Float height) {
		this.height = height;
	}

	/**
	 * 
	 * @return base
	 */
	public Float getBase() {
		return base;
	}

	/**
	 * 
	 * @param base
	 */
	public void setBase(Float base) {
		this.base = base;
	}
}
