package com.user.reg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.reg.DTO.UserRegResponse;
import com.user.reg.entity.UserReg;
import com.user.reg.service.UserRegService;

@RestController
@RequestMapping("/api/v1")

public class UserRegController {

	@Autowired
	UserRegService userRegService;

	@PostMapping("/auth/register")
	public ResponseEntity<UserRegResponse> saveUser(@RequestBody  UserReg userReg) {
		UserRegResponse userRegResponse = new UserRegResponse();

		userRegResponse = userRegService.saveUser(userReg);
		return new ResponseEntity<UserRegResponse>(userRegResponse, HttpStatus.OK);
	}

}
