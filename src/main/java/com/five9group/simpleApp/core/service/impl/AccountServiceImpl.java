package com.five9group.simpleApp.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.five9group.simpleApp.core.model.entities.Account;
import com.five9group.simpleApp.core.repositories.AccountRepo;
import com.five9group.simpleApp.core.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepo accountRepo;
	
	@Override
	public Account addAccount(Account accountData) {
		return  accountRepo.createAccount(accountData);
		
	}

	@Override
	public void deleteAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}
