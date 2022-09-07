package com.example.demo.sconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.Invalid.InvalidUserAuthEntityPoint;
import com.example.demo.filter.SecurityFilter;

@Configuration
@EnableWebSecurity
public class SecurtyConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userdetailserv;

	@Autowired
	private SecurityFilter SecuFil;
	
	@Autowired
	private BCryptPasswordEncoder passEnc;

	@Autowired
	private InvalidUserAuthEntityPoint authenticationEntryPoint;
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception{
		return super.authenticationManager();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userdetailserv).passwordEncoder(passEnc);
	}

	// Authortization
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/user/save", "/user/login","/user/welcome").permitAll()
		.anyRequest().authenticated()
		.and()
		.exceptionHandling()
		.authenticationEntryPoint(authenticationEntryPoint)
		.and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		// TODO:verfy user for 2nd request
		.and()
		//register second request on words 
		.addFilterBefore(SecuFil,UsernamePasswordAuthenticationFilter.class);
		
	}

}
