package com.example.demo.sevimpm;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.repo.UserRepo;
import com.example.demo.sevImp.UserServImp;
import com.example.demo.usermodal.UserModal;

@Service
public class UserServiceImp implements UserServImp, UserDetailsService {
	@Autowired
	private UserRepo Repo;

	@Autowired
	private BCryptPasswordEncoder Enco;

	@Override
	public Integer saveUser(UserModal User) {
		// Encode password
		User.setPassword(Enco.encode(User.getPassword()));
		return Repo.save(User).getId();

	}

	public Optional<UserModal> findByUserName(String name) {
		return Repo.findByusername(name);
	}

	// -------------------------------------//
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<UserModal> user = findByUserName(username);
		if (user.isEmpty()) {
			throw new UsernameNotFoundException("User not exits");
		}
		UserModal Data = user.get();
		return new User(username, Data.getPassword(),
				Data.getRoles().stream().map(roles -> new SimpleGrantedAuthority(roles)).collect(Collectors.toList()));
	}

}
