package com.min.spring.customTag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * <p>Title: UserBeanDefinitionParser</p>
 * <p>Description: 自定义标签解析器</p>
 * @author	zhouzm
 * @date	2019年5月14日
 * @version 1.0
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	protected Class getBeanClass(Element element){
		return User.class;
	}
	
	protected void doParse(Element element, BeanDefinitionBuilder bean){
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");
		
		if(StringUtils.hasText(userName)){
			bean.addPropertyValue("userName", userName);
		}
		
		if(StringUtils.hasText(email)){
			bean.addPropertyValue("email", email);
		}
	}
}
