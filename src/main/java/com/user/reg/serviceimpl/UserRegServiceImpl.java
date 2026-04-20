package com.user.reg.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.reg.DTO.UserRegData;
import com.user.reg.DTO.UserRegResponse;
import com.user.reg.entity.UserReg;
import com.user.reg.repo.UserRegRepo;
import com.user.reg.service.UserRegService;

@Service
public class UserRegServiceImpl implements UserRegService {

	@Autowired
	UserRegRepo userRegRepo;

	@Override
	public UserRegResponse saveUser(UserReg userReg) {
		
		//validation
		//if userreg filed empty then throw validation
		//{
	//	userRegResponse.setStatus("SUCCESS");
	//	userRegResponse.setMessage("User registered successfully");
	//	userRegData.setEmail(userReg.getEmail());
	//	userRegData.setUserId(userReg.getUserRegId());
	//	userRegResponse.setData(userRegData);
	//	}

		UserRegResponse userRegResponse = new UserRegResponse();

		userRegResponse.setStatus("SUCCESS");
		userRegResponse.setMessage("User registered successfully");
		UserRegData userRegData = new UserRegData();
		
		userRegRepo.save(userReg);
		userRegData.setEmail(userReg.getEmail());
		userRegData.setUserId(userReg.getUserRegId());
		userRegResponse.setData(userRegData);
		return userRegResponse;
	}

}
