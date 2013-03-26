package com.sample.commandlineapp;

public class InvalidRuntimeOptionException extends RuntimeException {

	private static final long serialVersionUID = 2428998999531048201L;
	private String message = "";
	
	public InvalidRuntimeOptionException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
