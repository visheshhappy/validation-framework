package com.vishesh.validation.api.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.vishesh.validation.annotation.BusinessValidation;
import com.vishesh.validation.annotation.NotNull;
import com.vishesh.validation.api.BusinessValidator;
import com.vishesh.validation.api.Validator;
import com.vishesh.validation.exception.ValidationException;
import com.vishesh.validation.pojo.Person;

@SuppressWarnings("rawtypes")
public class PersonValidator implements Validator<Person> {

	
	@SuppressWarnings("unchecked")
	public void validate(Person obj) {
		
		for(Field field : obj.getClass().getDeclaredFields()){
			field.setAccessible(true);
			for(Annotation annotation : field.getAnnotations()){
				if(annotation instanceof NotNull){
					try {
						if(field.get(obj)==null){
							throw new ValidationException(field.getName() +" is empty", ValidationException.Code.FIELD_EXCEPTION);
						}
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		
		for(Annotation annotation : obj.getClass().getAnnotations()){
			if(annotation instanceof BusinessValidation){
				BusinessValidation businessValidation = (BusinessValidation)annotation;
				for(Class<? extends BusinessValidator> businessValidator :businessValidation.classNames()){
					try {
						businessValidator.newInstance().validate(obj);
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
					
				}
			}
			
			
		}
		
	}

	

}
