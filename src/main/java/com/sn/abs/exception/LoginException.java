package com.sn.abs.exception;

/**
 * 登录异常
 * @author yangzhi
 */
public class LoginException extends RuntimeException {

	private String message;
	private static final long serialVersionUID = 1L;

	public LoginException() {
		super();
	}

	public LoginException(String message, Exception e) {
		super(message, e);
		this.message = message;
	}

	public LoginException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
