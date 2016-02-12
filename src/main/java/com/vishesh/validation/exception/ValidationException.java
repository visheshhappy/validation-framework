package com.vishesh.validation.exception;

public class ValidationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3318720248147770214L;

	private String message;

	public enum Code {
		FIELD_EXCEPTION, BUSINESS_EXCEPTION;
	}

	private Code code;

	private Throwable throwable;

	public ValidationException() {
		super();
	}

	public ValidationException(String message, Code code) {
		super(message);
		this.message = message;
		this.code = code;

	}

	public ValidationException(String message, Code code, Throwable e) {
		super(message, e);
		this.message = message;
		this.code = code;
		this.throwable = e;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	@Override
	public String toString() {
		return "ValidationException [message=" + message + ", code=" + code + ", throwable=" + throwable + "]";
	}

}
