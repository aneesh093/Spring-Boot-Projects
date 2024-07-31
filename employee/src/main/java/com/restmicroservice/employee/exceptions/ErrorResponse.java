package com.restmicroservice.employee.exceptions;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ErrorResponse {

	private String msg;
	private int statusCode;

	public ErrorResponse(String msg ) {
		super();
		this.msg = msg;
	}
	
}
