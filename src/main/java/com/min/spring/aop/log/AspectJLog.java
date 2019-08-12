package com.min.spring.aop.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
public class AspectJLog {
	//针对某个方法
	/*@Pointcut("execution(* *.addUser(..))")
	private void add() {}*/
	
	//针对某个类
	@Pointcut("execution(* com.min.spring.pojo.*.*User(..))")
	private void process() {}
	
	@Before("process()")
	public void beforeAdvice() {
		System.out.println("前置通知");
	}
	
	@Around("process()")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知：方法执行前");
		pjp.proceed();
		System.out.println("环绕通知：方法执行后");
	}
	
	@AfterReturning(pointcut="process()", returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("返回通知："+retVal);
	}
	
	@After("process()")
	public void afterAdvice() {
		System.out.println("后置通知");
	}
	
	@AfterThrowing(pointcut="process()", throwing="ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println("异常通知："+ex);
	}
}
