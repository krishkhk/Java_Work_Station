package com.jwtsecurity.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@Table(name = "usrtab")

public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String password;

	@ElementCollection
	@CollectionTable(name = "rolestab", joinColumns = @JoinColumn(name = "id"))

	@Column(name = "role")
	private Set<String> roles;
	
	
	

}
