package com.min.spring.aop.log;

import org.springframework.aop.ThrowsAdvice;

public class LogThrowingMethod implements ThrowsAdvice {
	public void afterThrowing(Exception e) throws Throwable {
		System.out.println("异常通知");
	}
}
