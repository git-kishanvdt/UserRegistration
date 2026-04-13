package com.user.reg.service;

import com.user.reg.DTO.UserRegResponse;
import com.user.reg.entity.UserReg;

public interface UserRegService {

	UserRegResponse saveUser(UserReg userReg);

}
