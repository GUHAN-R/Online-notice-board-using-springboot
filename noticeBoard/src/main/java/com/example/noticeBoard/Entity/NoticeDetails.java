package com.example.noticeBoard.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="NOTICE_DETAILS")

public class NoticeDetails {
	
	public NoticeDetails() {
		
	}
	
	
	
	public NoticeDetails(long userId, String title, String describ, String contact) {
		super();
		this.userId = userId;
		this.title = title;
		this.describ = describ;
		this.contact = contact;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private long id;



	@Column(name="USER_ID")
	private long userId;
	
	@Column(columnDefinition = "VARCHAR(100)", name = "NOTICE_TITLE")
	private String title;
	
	@Column(columnDefinition = "TEXT", name = "DESCRIP")
	private String describ;
	
	@Column(name="CONTACT")
	private String contact;

	public long getUserId() {
		return userId;
	}



	public void setUserId(long userId) {
		this.userId = userId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescrib() {
		return describ;
	}



	public void setDescrib(String describ) {
		this.describ = describ;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}




	
	
	

}
