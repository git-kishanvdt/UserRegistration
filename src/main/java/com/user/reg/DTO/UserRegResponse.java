package com.user.reg.DTO;

public class UserRegResponse {

	private String status;
	private String message;

	private UserRegData data;

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public UserRegData getData() {
		return data;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(UserRegData data) {
		this.data = data;
	}

}
