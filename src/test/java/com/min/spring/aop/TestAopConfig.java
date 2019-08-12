package com.min.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.min.spring.aop.poetry.Knight;

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
