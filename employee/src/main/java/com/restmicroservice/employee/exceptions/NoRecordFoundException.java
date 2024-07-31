package com.restmicroservice.employee.exceptions;

public class NoRecordFoundException extends RuntimeException{

	private String msg;
	
	public NoRecordFoundException() {
	}
	
	public NoRecordFoundException(String msg) {
		super(msg);
		this.msg=msg;
	}
	
}
