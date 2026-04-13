package com.user.reg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.reg.entity.UserReg;

public interface UserRegRepo extends JpaRepository<UserReg, String> {

}
