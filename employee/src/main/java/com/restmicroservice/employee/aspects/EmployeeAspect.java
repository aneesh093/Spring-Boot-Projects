package com.restmicroservice.employee.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

	@Before(value = "execution(* com.restmicroservice.employee.controller.EmployeeController.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("Before Method is called for "+jp.getSignature()+" method");
	}
	
	@After(value="execution(* com.restmicroservice.employee.controller.EmployeeController.*(..))")
	public void afterAdvice(JoinPoint jp) {
		System.out.println("After method is called for "+jp.getSignature());
	}
}
