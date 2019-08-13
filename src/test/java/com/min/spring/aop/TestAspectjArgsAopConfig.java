package com.min.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.min.spring.aop.poetry.Knight;
import com.min.spring.pojo.User;
import com.min.spring.pojo.UserService;

/**
 * @AspectJ注解通知执行顺序
 * 环绕通知
 * 前置通知
 * 执行方法
 * 环绕通知
 * 后置通知
 * 返回通知
 * 
 * 多个切面通过@Order指定顺序
 * 
 * 异常执行顺序
 * 环绕通知
 * 前置通知
 * 后置通知
 * 异常通知
 * 
 * @Pointcut("args()")接收方法参数
 * 
 * @author zhouzm
 *
 */
public class TestAspectjArgsAopConfig {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:aspectj-args-aop-config.xml");
		User user = (User)context.getBean("user");
		UserService proxy = (UserService)context.getBean("userService");
		proxy.addUser(user);
		proxy.info(10);
		context.close();
	}
}
