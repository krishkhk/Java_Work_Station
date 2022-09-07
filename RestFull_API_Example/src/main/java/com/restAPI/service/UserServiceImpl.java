package com.restAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restAPI.model.User;

@Service
public class UserServiceImpl implements UserService {

	
	
	public List<User> findAll() {
		
		ArrayList<User> usersList=new ArrayList<>();
		
		usersList.add(new User(121,"hari",(int) 895978484,"Hyderabad"));
		usersList.add(new User(122,"krishna",(int) 78484841,"Warngal"));
		usersList.add(new User(134,"jhon",(int) 456875112,"Mumbai"));
		usersList.add(new User(112,"jhony",(int) 995929344,"Pune"));
		usersList.add(new User(111,"steve",(int) 895978484,"Gujarath"));
		usersList.add(new User(254,"hunk",(int) 799848484,"Hyderabad"));
		
		
		
		return usersList;
		
		
	
	}

	
	
}
