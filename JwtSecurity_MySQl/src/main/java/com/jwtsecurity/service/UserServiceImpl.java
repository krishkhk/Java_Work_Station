package com.jwtsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwtsecurity.model.User;
import com.jwtsecurity.repo.UserRepo;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired(required = true)
	private UserRepo repo;
	
	public Integer saveUser(User user) {
		//TODO: EncodePassword
		
				return repo.save(user).getId();
	}

}
