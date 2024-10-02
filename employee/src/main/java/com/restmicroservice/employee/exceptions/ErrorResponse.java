package com.restmicroservice.employee.exceptions;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
public class ErrorResponse {

	private String msg;
	private int statusCode;

	public ErrorResponse(String msg ) {
		super();
		this.msg = msg;
	}
	
	public ErrorResponse(String msg ,int statusCode) {
		super();
		this.msg = msg;
		this.statusCode=statusCode;
	}

	public ErrorResponse() {
		super();
	}

}
