package com.min.spring.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Title: UserServiceTest</p>
 * <p>Description: </p>
 * @author	zhouzm
 * @date	2019年6月16日
 * @version 1.0
 */
public class UserServiceTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserMapper userMapper = (UserMapper)context.getBean("userMapper");
		User user = userMapper.getUser(1);
		System.out.println("name:"+user.getName()+",age:"+user.getAge());
		((ClassPathXmlApplicationContext)context).close();
	}
}
