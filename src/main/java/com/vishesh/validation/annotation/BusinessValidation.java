package com.vishesh.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.vishesh.validation.api.BusinessValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)
public @interface BusinessValidation {
	
	Class<? extends BusinessValidator>[] classNames();
	

}
