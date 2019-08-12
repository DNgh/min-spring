package com.min.spring.aop.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("环绕通知：开始");
		Object result = invocation.proceed();
		System.out.println("环绕通知：结束");
		
		return result;
	}

}
