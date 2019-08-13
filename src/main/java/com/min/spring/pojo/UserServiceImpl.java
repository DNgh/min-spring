package com.min.spring.pojo;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser(User user) {
		System.out.println("add a user:["+user+"]");
	}

	@Override
	public void updateUser(User user) {
		System.out.println("update a user:["+user.getName()+"]");
	}

	@Override
	public void info(int a) {
		System.out.println("number:"+a);
	}

}
