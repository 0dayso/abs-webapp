package com.sn.abs.conf;

public enum LogType {
	SECURITY(1, "系统安全"), 
	APP_ERROR(2, "业务应用错误"), 
	OTHER(3, "其他");

	private int value;
	private String desc;

	private LogType(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public int getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}
}
