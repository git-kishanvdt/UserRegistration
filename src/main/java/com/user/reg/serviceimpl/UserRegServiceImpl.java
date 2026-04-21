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

		// validation
		// if userreg filed empty then throw validation
		// {
		// userRegResponse.setStatus("SUCCESS");
		// userRegResponse.setMessage("User registered successfully");
		// userRegData.setEmail(userReg.getEmail());
		// userRegData.setUserId(userReg.getUserRegId());
		// userRegResponse.setData(userRegData);
		// }

		UserRegResponse userRegResponse = new UserRegResponse();

		if (userReg.getEmail() == null || userReg.getEmail().isEmpty() || userReg.getName() == null
				|| userReg.getName().isEmpty() || userReg.getPhoneNumber() == null || userReg.getPhoneNumber() < 1
				|| userReg.getPassword() == null || userReg.getPassword().isEmpty()) {
			System.out.println("Field is Empty");

			userRegResponse.setStatus("Error");
			/*
			 * userRegResponse.setMessage("Email already exist");
			 * userReg.setEmail(userReg.getEmail());
			 * 
			 * 
			 * userRegResponse.setStatus("Duplicate");
			 * userRegResponse.setMessage("Duplicate names");
			 * userReg.setName(userReg.getName());
			 */

			return userRegResponse;

		} else {

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

}
