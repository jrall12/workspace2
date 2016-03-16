package com.five9group.simpleApp.rest.resource;

import org.springframework.hateoas.ResourceSupport;

import com.five9group.simpleApp.core.model.entities.Account;

public class AccountResource  extends ResourceSupport {

	private String userId;
	private String emailAddress;
	
		
	public final String getUserId() {
		return userId;
	}
	public final void setUserId(String userId) {
		this.userId = userId;
	}
	public final String getEmailAddress() {
		return emailAddress;
	}
	public final void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	  public Account toAccount() { 
	        Account account = new Account(); 
	        account.setUserId(userId);
	        account.setEmailAddress(emailAddress);
	         return account; 
	     } 
}
