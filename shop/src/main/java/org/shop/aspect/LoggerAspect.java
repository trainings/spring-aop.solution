package org.shop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {
	
	@Before("execution(* org.shop.api.OrderService.createOrder(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("LoggerAspect: " + joinPoint.getSignature());
	}
}
