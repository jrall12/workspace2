package com.five9group.simpleApp.core.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	@Id @GeneratedValue
	private Integer Id;
	private String userId;
	private String emailAddress;
	
	public Integer getId() {
		return this.Id;
	}
	public void setId(final Integer id) {
		Id = id;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(final String userId) {
		this.userId = userId;
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
	public void setEmailAddress(final String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
