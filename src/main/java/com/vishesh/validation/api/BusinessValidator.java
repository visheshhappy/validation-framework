package com.vishesh.validation.api;

public interface BusinessValidator<T> {
	void validate(T obj, Object... objArray);
}
