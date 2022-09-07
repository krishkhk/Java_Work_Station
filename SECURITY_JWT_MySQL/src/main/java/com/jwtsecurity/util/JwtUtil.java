package com.jwtsecurity.util;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

	@Value("${app.secret}")
	private String secretKey;
	
	//6.validate username in token and database exp.
	
	public boolean validateToken(String token, String username) {
		
		String tokenUserName=getUsername(token);
		
		return (username.equals(tokenUserName)&& !isExpDate(token));
	}
	
	
	//5.validate exp date:
	public boolean isExpDate(String token) {
		
		Date expDate=getExpDate(token);
		
		return expDate.before(new Date(System.currentTimeMillis()));
	}
	
	//4.Read Subject/username
			public String getUsername(String token) {
				return getClaims(token).getSubject();
				
				
			}
			
	
	//3.Read ExpireDate.
	public Date getExpDate(String token) {
		
		return getClaims(token).getExpiration();
	}
	
	//2.Read Claims.
		public	Claims  getClaims(String token){
				
				return Jwts.parser()
						.setSigningKey(secretKey.getBytes())
						.parseClaimsJws(token)
						.getBody();
				
			
				
				
				
			}
	
	//1.Generate Token.
	public String generateToken(String subject) {
	
		
		return Jwts.builder()
				.setSubject(subject)
				.setIssuer("HariKrishna")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+ TimeUnit.MINUTES.toMillis(5)))
				.signWith(SignatureAlgorithm.HS256,secretKey.getBytes())
				.compact();
		
		
		
		
		
	}
	
}
