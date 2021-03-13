package com.filipesoares.demo.exception;

public class RecursoNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public RecursoNotFoundException(String message) {
		super(message);
	}
}