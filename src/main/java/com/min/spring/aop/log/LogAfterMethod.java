package com.min.spring.aop.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterMethod implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		String className = target.getClass().getName();
		String methodName = method.getName();
		String logInfoText="后置通知：执行"+className+"类的"+methodName+"方法结束";
		System.out.println(logInfoText);
	}

}
