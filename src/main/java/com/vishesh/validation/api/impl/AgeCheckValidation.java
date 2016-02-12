package com.vishesh.validation.api.impl;

import com.vishesh.validation.api.BusinessValidator;
import com.vishesh.validation.exception.ValidationException;
import com.vishesh.validation.pojo.Person;

public class AgeCheckValidation implements BusinessValidator<Person> {

	public void validate(Person obj, Object... objArray) {
		if (obj.getAge() > 100 || obj.getAge() < 5) {
			throw new ValidationException("Age not within limits", ValidationException.Code.BUSINESS_EXCEPTION);
		}

	}

}
