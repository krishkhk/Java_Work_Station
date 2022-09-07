package com.springsecurity.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

public class SecurityConfig extends WebSecurityConfiguration {
	
	public void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
	}
	
	public void configure(HttpSecurity http)throws Exception {
		
		http.antMatcher("/**").authorizeRequests().anyRequest().hasRole("USER").and().formLogin().loginPage("/login.jsp").permitAll().and().logout().logoutSuccessUrl("listEmployees.html");
		
	}

}
