package com.min.spring.proxy;

import java.lang.reflect.Proxy;

public class TestProxy {
	public static void main(String[] args) {
		Subject target = new SubjectImpl();
		ProxyInvocationHandler handler = new ProxyInvocationHandler(target);
		Subject proxy = (Subject)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
		proxy.sayHi();
		System.out.println(proxy);
	}
}
