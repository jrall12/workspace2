package com.five9group.simpleApp.core.service;

import com.five9group.simpleApp.core.model.entities.Account;
import com.five9group.simpleApp.rest.resource.AccountResource;

public interface AccountService {

	public Account addAccount(Account accountData);
	public void deleteAccount(Account account);
	public Account updateAccount(Account account);
}
