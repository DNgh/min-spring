package com.min.spring.cglib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * <p>Title: ProxyClient</p>
 * <p>Description: </p>
 * @author	zhouzm
 * @date	2019年6月29日
 * @version 1.0
 */
public class ProxyClient {
	public static void main(String[] args) {
		 //该设置用于输出cglib动态代理产生的类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "cglibclass");
		// 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(AnimalClass.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());
        // 创建代理对象
        AnimalClass proxy= (AnimalClass)enhancer.create();
        // 通过代理对象调用目标方法
        proxy.bite("hahaha");
        proxy.eat("grass");
        System.out.println(proxy.getClass());
	}
}
