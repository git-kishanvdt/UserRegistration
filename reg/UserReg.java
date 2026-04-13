package com.user.reg;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserReg {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UserId")
	private String userRegId;
	@Column(name = "Name")
	private String name;
	@Column(name = "Email")
	private String eMail;
	@Column(name = "PhoneNumber")
	private Integer phoneNumber;
	@Column(name = "Password")
	private String password;
	@Column(name = "ConfirmPassword")
	private String confirmPassword;

	public String getUserRegId() {
		return userRegId;
	}

	public void setUserRegId(String userRegId) {
		this.userRegId = userRegId;
	}

	public String getName() {
		return name;
	}

	public String geteMail() {
		return eMail;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
