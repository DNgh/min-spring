package com.min.spring.cglib;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * <p>Title: MyMethodInvocation</p>
 * <p>Description: </p>
 * @author	zhouzm
 * @date	2019年6月29日
 * @version 1.0
 */
public class MyMethodInterceptor implements MethodInterceptor {

	/* (non-Javadoc)
	 * @see org.springframework.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], org.springframework.cglib.proxy.MethodProxy)
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("前置通知");
		Object obj = methodProxy.invokeSuper(proxy, objects);
		System.out.println("后置通知");
		return obj;
	}

}
