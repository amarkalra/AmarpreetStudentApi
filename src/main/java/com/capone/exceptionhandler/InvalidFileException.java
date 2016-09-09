package com.capone.exceptionhandler;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidFileException extends Exception {

	private static final Logger logger = LoggerFactory
			.getLogger(InvalidFileException.class);

	public InvalidFileException(String message) {
		super(message);
	}
}
