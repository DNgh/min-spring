package com.min.spring.customTag;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * <p>Title: CustomerTagTest</p>
 * <p>Description: </p>
 * @author	zhouzm
 * @date	2019年5月14日
 * @version 1.0
 */  
public class CustomerTagTest {  
    public static void main(String[] args) {  
        ApplicationContext beans=new ClassPathXmlApplicationContext("classpath:customTag-context.xml");  
        User user=(User)beans.getBean("testBean");  
        System.out.println("username:"+user.getUserName()+":"+"email:"+user.getEmail());  
    }  
}