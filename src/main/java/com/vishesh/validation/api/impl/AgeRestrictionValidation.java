package com.vishesh.validation.api.impl;

import com.vishesh.validation.api.BusinessValidator;
import com.vishesh.validation.exception.ValidationException;
import com.vishesh.validation.pojo.Person;

public class AgeRestrictionValidation implements BusinessValidator<Person> {

	public void validate(Person obj, Object... objArray) {
		if(obj.getAge()>45 && obj.getAge() <50){
			throw new ValidationException("The given age is in restricted group", ValidationException.Code.BUSINESS_EXCEPTION);
		}
		
	}

}
