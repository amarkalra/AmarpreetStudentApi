package com.capone.exceptionhandler;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@ControllerAdvice
@RestController
public class StudentAPIExceptionHandler {
	private static final Logger logger = LoggerFactory
			.getLogger(StudentAPIExceptionHandler.class);

	@ExceptionHandler(InvalidFileException.class)
	public String sendException(HttpServletRequest request, Exception ex) {
		logger.info("Exception has occured");
		return ex.getMessage();
	}
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(RecordNotFoundException.class)
    public String handleInvalidOperationException(HttpServletRequest request, Exception ex) {
		logger.info("Exception has occured");
		return ex.getMessage();
	}

	
	
}
