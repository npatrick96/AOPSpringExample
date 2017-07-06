package com.gcit.aop.test;

//Static - Compile Time
//Aspect : Logging. Aspect is the concern that we are trying to implement generically. Ex: logging, transaction management. Advice is the specific aspect of the concern we are implementing.
//Pointcut : An expression which determines what are the methods that the Advice should be applied on.
//execution(* com.in28minutes.example.spring.business.aop.HiByeService.*(..))
//Advice: action taken by an aspect at a particular join point. Different types of advice include "around," "before" and "after" advice. (Advice types are discussed below.) Many AOP frameworks, including Spring, model an advice as an interceptor, maintaining a chain of interceptors around the join point.

//Dynamic - Runtime
//Join point: a point during the execution of a program, such as the execution of a method or the handling of an exception.
//In Spring AOP, a join point always represents a method execution.
//Weaving: linking aspects with other application types or objects to create an advised object. This can be done at compile time (using the AspectJ compiler, for example), load time, or at runtime. Spring AOP, like other pure Java AOP frameworks, performs weaving at runtime.

//Spring AOP is very simple implementation of AOP concepts. Its an ideal fit If the needs of an application are simple like
//AspectJ is a full fledged AOP framework that helps you
//Advise objects not managed by the Spring container .
//Advise join points other than simple method executions (for example, field get or set join points).

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gcit.aop.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextAOP.class)
public class AOPExampleTest {

	@Autowired
	private HiByeService service;

	@Test
	public void testSomething() {
		service.sayHi("Patrick Niyongabo");
		service.sayBye("Niyongabo");
		service.returnSomething();
	}

}

