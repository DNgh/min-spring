package com.min.spring.aop;

import java.io.PrintStream;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {

  private PrintStream stream;
  
  public Advice(PrintStream stream) {
    this.stream = stream;
  }

  public void singBeforeQuest() {
    stream.println("前置通知Before");
  }

  public void singAfterQuest() {
    stream.println("后置通知After");
  }
  
  public void singAfterReturningQuest() {
	stream.println("返回通知AfterReturning");
  }

  public void singAfterThrowingQuest() {
    stream.println("异常通知AfterThrowing");
  }
  
  public void singAroundQuest(ProceedingJoinPoint pjp) throws Throwable {
	stream.println("环绕通知Around开始");
	pjp.proceed();
	stream.println("环绕通知Around结束");
  }

}
