package com.java.learning.task.exception;

public class LearningTaskException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LearningTaskException() {
		super();
	}

	public LearningTaskException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LearningTaskException(String message, Throwable cause) {
		super(message, cause);
	}

	public LearningTaskException(String message) {
		super(message);
	}

	public LearningTaskException(Throwable cause) {
		super(cause);
	}

}
