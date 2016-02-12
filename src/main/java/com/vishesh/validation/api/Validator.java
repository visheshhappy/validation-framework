package com.vishesh.validation.api;

public interface Validator<T> {
	
	void validate(T obj);

}
