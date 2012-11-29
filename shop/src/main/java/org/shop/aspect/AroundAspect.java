package org.shop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;

@Aspect
public class AroundAspect implements Ordered {
    
    @Around("execution(* org.shop.api.OrderService.createOrder(..))")
    public void logBefore(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(getClass().getCanonicalName() + " before");
        joinPoint.proceed();
        System.out.println(getClass().getCanonicalName() + " after");
    }

    /* (non-Javadoc)
     * @see org.springframework.core.Ordered#getOrder()
     */
    @Override
    public int getOrder() {
        return 100;
    }
}
