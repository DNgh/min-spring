package com.min.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CDPlayerMainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		MediaPlayer player = context.getBean(MediaPlayer.class);
		player.play();
		context.close();
	}
}
