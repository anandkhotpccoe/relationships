package com.example.relationships.onetoone;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	
	
	@OneToOne
	private User user;
	
	
	private String username;
	
	
	@Enumerated(EnumType.STRING)
	private Gender gender;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public UserProfile(Long id, String username, Gender gender) {
		super();
		this.id = id;
		this.username = username;
		this.gender = gender;
	}


	public UserProfile() {
		super();
	}
	
	
	
	

}
