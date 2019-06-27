package com.min.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {
	private Subject target;
	
	public ProxyInvocationHandler(Subject target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before invoke");
		Object result = method.invoke(target, args);
		System.out.println("after invoke");
		return result;
	}

}
