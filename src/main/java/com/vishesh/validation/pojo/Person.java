package com.vishesh.validation.pojo;

import java.util.Map;

import com.vishesh.validation.annotation.BusinessValidation;
import com.vishesh.validation.annotation.NotNull;
import com.vishesh.validation.api.impl.AgeCheckValidation;
import com.vishesh.validation.api.impl.AgeRestrictionValidation;
import com.vishesh.validation.api.impl.NewAgeRestrictionValidator;

@BusinessValidation(classNames={AgeCheckValidation.class,AgeRestrictionValidation.class,NewAgeRestrictionValidator.class})
public class Person {

	@NotNull
	private String name;
	@NotNull
	private String email;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
