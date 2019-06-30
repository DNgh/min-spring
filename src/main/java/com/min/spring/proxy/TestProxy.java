package com.min.spring.proxy;

import java.lang.reflect.Proxy;

public class TestProxy {
	public static void main(String[] args) {
		//该设置用于输出jdk动态代理产生的类
		//项目根目录下创建com/sun/proxy,不是src目录
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		Subject target = new SubjectImpl();
		ProxyInvocationHandler handler = new ProxyInvocationHandler(target);
		Subject proxy = (Subject)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
		proxy.sayHi();
		proxy.sayHello();
		System.out.println(proxy);
		System.out.println(proxy.getClass());
	}
}
