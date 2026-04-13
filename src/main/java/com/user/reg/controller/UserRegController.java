package com.user.reg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.reg.DTO.UserRegResponse;
import com.user.reg.entity.UserReg;

@RestController
@RequestMapping("/api/v1")

public class UserRegController {

	 @PostMapping("/auth/register")
	 public ResponseEntity<UserRegResponse> saveUser(UserReg userReg) {
	        UserRegResponse userRegResponse= new UserRegResponse();
	        return new ResponseEntity<UserRegResponse>(userRegResponse,HttpStatus.OK);
	 }

}
