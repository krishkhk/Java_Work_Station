package com.example.demo.sevImp;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;

import com.example.demo.usermodal.UserModal;


public interface UserServImp {
	
Integer saveUser(UserModal User);
public Optional <UserModal> findByUserName(String name);
}
