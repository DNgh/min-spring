package com.min.spring.aop.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.min.spring.pojo.User;
/**
 * @AspectJ注解通知执行顺序
 * 环绕通知
 * 前置通知
 * 执行方法
 * 环绕通知
 * 后置通知
 * 返回通知
 * @author zhouzm
 *
 */
@Aspect
public class AspectJArgsLog {
	
	//针对某个类
	@Pointcut("execution(* com.min.spring.pojo.*.info(int))"
			+ "&& args(number)")
	private void process(int number) {}
	
	@Before("process(number)")
	public void beforeAdvice(int number) {
		System.out.println("前置通知:"+number);
	}
	
	@Around("process(number)")
	public void aroundAdvice(ProceedingJoinPoint pjp, int number) throws Throwable {
		System.out.println("环绕通知：方法执行前,number:"+number);
		pjp.proceed();
		System.out.println("环绕通知：方法执行后");
	}
	
	@AfterReturning(pointcut="process(number)", returning="retVal")
	public void afterReturningAdvice(Object retVal, int number) {
		System.out.println("返回通知："+retVal);
	}
	
	@After("process(number)")
	public void afterAdvice(int number) {
		System.out.println("后置通知");
	}
	
	@AfterThrowing(pointcut="process(number)", throwing="ex")
	public void afterThrowingAdvice(Throwable ex, int number) {
		System.out.println("异常通知："+ex);
	}
}
