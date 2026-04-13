package com.user.reg.repo;

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
	private String name;

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

	private String eMail;
	private Integer phoneNumber;
	private String password;
	private String confirmPassword;

}
