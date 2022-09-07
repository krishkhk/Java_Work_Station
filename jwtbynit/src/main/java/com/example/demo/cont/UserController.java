package com.example.demo.cont;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jwtUtil.JwtUtil;
import com.example.demo.sevimpm.UserServiceImp;
import com.example.demo.ures.UserResponse;
import com.example.demo.usermodal.UserModal;
import com.example.demo.usreqmodal.UserRequestmodal;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	
	 //Logger logger
    // = LoggerFactory.getLogger(LogController.class);
	@Autowired
	private UserServiceImp imp;
	
	@Autowired
	private JwtUtil jwt;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/save")
	public ResponseEntity<String> saveUse(@RequestBody UserModal user) {
		//System.out.println("2");
	//	System.out.println(user);
		Integer id = imp.saveUser(user);
		String body = "user" + id + "saved";
		// return new ResponseEntity<String>(body,HttpStatus.OK);
		return ResponseEntity.ok(body);
	}

	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUse(@RequestBody UserRequestmodal request) {
		log.info("login data is came username{} and password{}",request.getUsername(),request.getPassword());
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

		String token = jwt.generateToken(request.getUsername());
		return ResponseEntity.ok(new UserResponse(token, "sucess! generate by lokesh"));
	}
	
	@GetMapping("/ ")
	public String projectCheck() {
		return "controller is running";
	}
	
	
	//3 after login only
	@PostMapping("/welcome")
	public ResponseEntity<String> acesData(Principal p){
		System.out.println(p);
		return ResponseEntity.ok("Hello User!"+p.getName());
	}
	
	
}
