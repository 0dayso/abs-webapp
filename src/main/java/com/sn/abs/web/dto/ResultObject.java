package com.sn.abs.web.dto;

public class ResultObject<T> {

	/**
	 * 错误代码：默认为0，无错
	 */
	private int code = 0;
	/**
	 * 错误消息
	 */
	private String msg = null;
	private T data;

	private long assitant;
	private double amount;

	private String attribute1;
	private String attribute2;
	private String attr3;
	private String attr4;

	public String getAttr3() {
		return attr3;
	}

	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}

	public String getAttr4() {
		return attr4;
	}

	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}

	public long getAssitant() {
		return assitant;
	}

	public void setAssitant(long assitant) {
		this.assitant = assitant;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public T getData() {
		return data;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ResultObject() {

	}

	public ResultObject(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public enum Status {
		SUCCESS(0), FAILTURE(1);
		private int value;

		private Status(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}
}
