package com.vishesh.validation.service.impl;

import com.vishesh.validation.annotation.PojoValidation;
import com.vishesh.validation.api.Validator;
import com.vishesh.validation.pojo.Person;
import com.vishesh.validation.service.PersonService;

public class PersonServiceImpl implements PersonService {

	private Validator<Person> validator;

	public Validator<Person> getValidator() {
		return validator;
	}

	public void setValidator(Validator<Person> validator) {
		this.validator = validator;
	}

	@PojoValidation
	public void savePerson(Person person) {
		System.out.println("Person is validated till this step..!!!");
	}

}
