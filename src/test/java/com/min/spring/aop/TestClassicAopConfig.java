package com.min.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.min.spring.aop.poetry.Knight;
import com.min.spring.pojo.User;
import com.min.spring.pojo.UserService;

public class TestClassicAopConfig {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:classic-aop-config.xml");
		User user = (User)context.getBean("user");
		UserService proxy = (UserService)context.getBean("proxy");
		proxy.addUser(user);
		proxy.updateUser(null);
		context.close();
	}
}
