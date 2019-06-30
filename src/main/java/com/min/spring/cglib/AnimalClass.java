package com.min.spring.cglib;

/**
 * <p>Title: AnimalClass</p>
 * <p>Description: </p>
 * @author	zhouzm
 * @date	2019年6月29日
 * @version 1.0
 */
public class AnimalClass {
	public AnimalClass(){
		System.out.println("AnimalClass构造器");
	}
	
	public void bite(String a) {
		System.out.println("bite:"+a);
	}
	
	public void eat(String a) {
		System.out.println("eat:"+a);
	}
}
