package com.vishesh.validation.api.impl;

import com.vishesh.validation.api.BusinessValidator;
import com.vishesh.validation.exception.ValidationException;
import com.vishesh.validation.pojo.Person;

public class NewAgeRestrictionValidator implements BusinessValidator<Person> {

	public void validate(Person obj, Object... objArray) {
		if(obj.getAge()>75 && obj.getAge()<85){
			throw new ValidationException("New age restruction violated", ValidationException.Code.BUSINESS_EXCEPTION);
		}
		
	}

}
