package com.example.demo.jwtUtil;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	@Value("${app.secret}")
	private String secret;
	//validate username in token and database,exdate
	public boolean validateToken(String token,String username) {
		String tokenUserName=getUsername(token);
		return(username.equals(tokenUserName)&&!isTokenExp(token));
	}
	//validate exp or not
	public boolean isTokenExp(String token) {
		Date expDate=getExpDate(token);
		return expDate.before(new Date(System.currentTimeMillis()));
	}
	//read subjet/username
	public String getUsername(String token) {
		return getClaims(token).getSubject();
	}
//read Expiry
	public Date getExpDate(String token) {
		return getClaims(token).getExpiration();
	}
//Read claimes
	public Claims getClaims(String token) {
		return Jwts.parser()
				.setSigningKey(secret.getBytes())
				.parseClaimsJws(token)
				.getBody();
	}
//genetrate the token
	public String generateToken(String subject) {

		return Jwts.builder().setSubject(subject).setIssuer("illalokesh")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5)))
				.signWith(SignatureAlgorithm.HS512, secret.getBytes()).compact();
	}
	//1)generating the token and then according to time and date check the 
	//expiry then  check the username in the data base & tokendate before expiry then
	//only return the data

}
