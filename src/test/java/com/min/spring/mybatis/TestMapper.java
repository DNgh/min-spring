package com.min.spring.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class TestMapper {
	static SqlSessionFactory sqlSessionFactory;
	
	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}
	
	
	public void testAdd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User("min", 18);
			user.setSex("Male");
			userMapper.insertUser(user);
			sqlSession.commit();
		}finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void getUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.getUser(1);
			System.out.println("name:"+user.getName()+",age:"+user.getAge());
		}finally {
			sqlSession.close();
		}
	}
}
