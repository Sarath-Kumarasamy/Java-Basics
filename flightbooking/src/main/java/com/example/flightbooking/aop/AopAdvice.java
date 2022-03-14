package com.example.flightbooking.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class AopAdvice 
{
	
	Logger log = LoggerFactory.getLogger(AopAdvice.class);
	ObjectMapper mapper = new ObjectMapper();
	
//	@Before("execution(* com.example.flightbooking.*.*.*(..))")
//	public void before(JoinPoint jp) throws JsonProcessingException
//	{
//		log.info("method invoked : " + jp.getSignature().getName() + " with args " + mapper.writeValueAsString(jp.getArgs()));
//	}
//	
//	@AfterReturning(pointcut = "execution(* com.example.flightbooking.*.*.*(..))", returning="result")
//	public void after(JoinPoint jp, Object result) throws JsonProcessingException
//	{
//		log.info("method execution completed : " + jp.getSignature().getName() + mapper.writeValueAsString(result));
//	}
	
	@Pointcut(value="execution(* com.example.flightbooking.*.*.*(..))")
	public void aroundAdvicePointcut()
	{
	}
	
	@Around("aroundAdvicePointcut()")
	public Object aroundAdviceExecution(ProceedingJoinPoint pjp) throws Throwable
	{
		String methodName = pjp.getSignature().getName();
		String className = pjp.getClass().getName();
		
		log.info("method invoked : " + className + "." + methodName + " with args " + mapper.writeValueAsString(pjp.getArgs()));
		
		Object obj = pjp.proceed();
		
		log.info("method execution completed : " + className + "." + methodName + " with response " + mapper.writeValueAsString(obj));
		
		return obj;
	}
	
}
