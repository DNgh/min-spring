package com.min.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.min.spring.aop.poetry.Knight;
import com.min.spring.pojo.User;
import com.min.spring.pojo.UserService;

/**
 * 经典AOP通知执行顺序
 * 前置通知
 * 环绕通知
 * 执行方法
 * 环绕通知
 * 返回通知
 * 后置通知
 * 
 * 异常执行顺序：
 * 前置通知
 * 环绕通知
 * 异常通知
 * @author zhouzm
 *
 */
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
