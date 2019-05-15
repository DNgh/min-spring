package com.min.spring.loadBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:factoryBean-context.xml");
		Car car = (Car)context.getBean("car");
		System.out.println(car);
		
		Object obj = context.getBean("&car");
		System.out.println(obj);
	}
}
