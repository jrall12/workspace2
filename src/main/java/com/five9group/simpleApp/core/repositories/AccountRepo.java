package com.five9group.simpleApp.core.repositories;

import com.five9group.simpleApp.core.model.entities.Account;

public interface AccountRepo {

	public Account createAccount(Account account);
	public Account deleteAccount(Account account);
	public Account findAccount(Integer integer);
}
