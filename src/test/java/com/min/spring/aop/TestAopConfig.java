package com.min.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.min.spring.aop.poetry.Knight;

/**
 * 纯POJO切面通知执行顺序
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
 * 后置通知
 * @author zhouzm
 *
 */
public class TestAopConfig {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop-config.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		/*SlayDragonQuest quest = (SlayDragonQuest)context.getBean("quest");
		quest.embark();*/
		context.close();
	}
}
