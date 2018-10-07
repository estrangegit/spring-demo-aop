package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// this is where we add all of our related advices for logging
	
	// lets's start with an @Before advice
	
	// Match join points of every addAccount() method
//	@Before("execution(public void addAccount())")
//	public void beforeAddAccountAdvice() {		
//		System.out.println("\n=====>>> Executing @Before advice on method addAccount");		
//	}
	
	// Match only com.luv2code.aopdemo.dao.AccountDAO.addAccount() method
//	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
//	public void beforeAddAccountAdvice() {		
//		System.out.println("\n=====>>> Executing @Before advice on method com.luv2code.aopdemo.dao.AccountDAO.addAccount");		
//	}
	
	// Match every method which starts with add in any class
//	@Before("execution(public void add*())")
//	public void beforeAddAdvice() {		
//		System.out.println("\n=====>>> Executing @Before advice on every method which starts with add in any class");		
//	}
	
	// Match on every modifier, for every method with boolean as a return type and add* name
	@Before("execution(boolean add*())")
	public void beforeAddAdvice() {		
		System.out.println("\n=====>>> Executing @Before advice on every method with boolean as a return type and add* name");		
	}	
	
	// Match join points of any types within the com.luv2code.aopdemo.dao package
//	@Before("within(com.luv2code.aopdemo.dao.*)")
//	public void withinPCD() {
//		System.out.println("\n=====>>> Executing @Before with 'within' pointcut designator");		
//	}
	
	// Match join points of any return value, for any method name, in any class name in the package com.luv2code.aopdemo.dao
	// the (..) pattern matches any number of parameters (zero or more)
//	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
//	public void beforeMethodsInPackage() {
//		System.out.println("\n=====>>> Executing @Before any method of any class in com.luv2code.aopdemo.dao");		
//	}	
}
