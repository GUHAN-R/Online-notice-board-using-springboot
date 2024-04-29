package com.example.noticeBoard.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")

public class UserDetails {
	
	public UserDetails() {
		
	}
	
	
	
	



	public UserDetails(String userName, String userEmail, String password) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
	}







	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@Column(name="USER_PASS")
	private String password;

	public Long getId() {
		return id;
	}







	public void setId(Long id) {
		this.id = id;
	}







	public String getUserName() {
		return userName;
	}







	public void setUserName(String userName) {
		this.userName = userName;
	}







	public String getUserEmail() {
		return userEmail;
	}







	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}







	public String getPassword() {
		return password;
	}







	public void setPassword(String password) {
		this.password = password;
	}

	
	
	

}
