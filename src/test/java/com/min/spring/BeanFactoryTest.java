package com.min.spring;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import com.min.spring.loadBean.Car;

/**
 * <p>Title: BeanFactoryTest</p>
 * <p>Description: </p>
 * @author	zhouzm
 * @date	2019年5月26日
 * @version 1.0
 */
public class BeanFactoryTest {
	/**
	 * BeanFactory测试，Bean加载解析过程
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("application-context.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		Car car = (Car)factory.getBean("car");
		System.out.println(car);
	}
}
