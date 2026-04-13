package com.user.reg.serviceimpl;

import org.springframework.stereotype.Service;

import com.user.reg.DTO.UserRegData;
import com.user.reg.DTO.UserRegResponse;
import com.user.reg.entity.UserReg;
import com.user.reg.service.UserRegService;

@Service
public class UserRegServiceImpl implements UserRegService {

	@Override
	public UserRegResponse saveUser(UserReg userReg) {

		UserRegResponse userRegResponse = new UserRegResponse();

		UserRegData userRegData = new UserRegData();
		userRegData.seteMail(userReg.geteMail());
		userRegData.setUserId(Integer.valueOf(userReg.getUserRegId()));

		userRegResponse.setData(null);
		userReg.getUserRegId();
		return null;
	}

}
