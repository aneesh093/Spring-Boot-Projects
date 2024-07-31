package com.restmicroservice.employee.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value=NoRecordFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public @ResponseBody ErrorResponse getException(NoRecordFoundException no) {
		return new ErrorResponse(no.getMessage(),HttpStatus.NOT_FOUND.value());
	}
}
