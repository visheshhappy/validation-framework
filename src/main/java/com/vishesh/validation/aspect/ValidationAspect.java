package com.vishesh.validation.aspect;

import java.lang.reflect.Field;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.vishesh.validation.api.Validator;

@Aspect
public class ValidationAspect {
	
	@Pointcut("@annotation(com.vishesh.validation.annotation.PojoValidation)")
    public void isAnnotated() {}
	
	@Before("isAnnotated()")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("POJO validation is started..!!");
		Object obj = joinPoint.getArgs()[0];
		try {
			Object targetObject = joinPoint.getTarget();
			Field field =  targetObject.getClass().getDeclaredField("validator");
			field.setAccessible(true);
			Validator validator = (Validator)field.get(targetObject);
			validator.validate(obj);
		} catch ( SecurityException | IllegalArgumentException |  NoSuchFieldException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
