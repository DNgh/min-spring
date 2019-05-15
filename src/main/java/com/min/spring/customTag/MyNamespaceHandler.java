package com.min.spring.customTag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * <p>Title: MyNamespaceHandler</p>
 * <p>Description: 自定义标签命名空间处理器</p>
 * @author	zhouzm
 * @date	2019年5月14日
 * @version 1.0
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.xml.NamespaceHandler#init()
	 */
	@Override
	public void init() {
		// TODO Auto-generated method stub
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}

}
