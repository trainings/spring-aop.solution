package org.shop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

public class BeforeAspect {
    
    @Before("execution(* org.shop.api.OrderService.createOrder(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println(getClass().getSimpleName() + joinPoint.getSignature());
    }
}
