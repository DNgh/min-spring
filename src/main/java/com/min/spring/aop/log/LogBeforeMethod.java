package com.min.spring.aop.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeMethod implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String className = target.getClass().getName();
		String methodName = method.getName();
		String logInfoText="前置通知：开始执行"+className+"类的"+methodName+"方法";
		System.out.println(logInfoText);
	}

}
