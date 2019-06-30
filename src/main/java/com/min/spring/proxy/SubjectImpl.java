package com.min.spring.proxy;

public class SubjectImpl implements Subject {

	@Override
	public void sayHi() {
		System.out.println("say:Hi");
	}

	/* (non-Javadoc)
	 * @see com.min.spring.proxy.Subject#sayHello()
	 */
	@Override
	public void sayHello() {
		System.out.println("say:Hello");
	}

}
