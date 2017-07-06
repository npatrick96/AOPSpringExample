package com.gcit.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
class MyAspect {
	@Before("execution(* com.gcit.aop.HiByeService.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.print("Before Report: Method '");
		System.out.print(joinPoint.getSignature().getName() + "' called with ");
		System.out.println(Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.gcit.aop.HiByeService.*(..))", returning = "result")
	public void after(JoinPoint joinPoint, Object result) {
		System.out.print("After Report: Method '");
		System.out.print(joinPoint.getSignature().getName());
		System.out.println("' result is " + result);
		System.out.println("");
	}

}