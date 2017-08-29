package com.timmy.entity;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {
	
	
	public void before1()
	{
		System.out.println("before1.................");
	}
	
	public void after1()
	{
		System.out.println("after1.................");
	}
	
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{
		System.out.println("方法之前");
		proceedingJoinPoint.proceed();
		System.out.println("方法之后");
	}
	public void test()
	{
		System.out.println("mybook..............");
	}

}
