package com.revature.p0.exception;


public class TuitionLessThanZeroException extends Exception {

	public static final String MSG = "Tuition must be at least 0.";
	
	public TuitionLessThanZeroException() {
		super(MSG);
	}
	
	public TuitionLessThanZeroException(throwable cause) {
		super(MSG, cause);
	}
}
