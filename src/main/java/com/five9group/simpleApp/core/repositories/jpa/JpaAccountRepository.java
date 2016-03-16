package com.five9group.simpleApp.core.repositories.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;

import com.five9group.simpleApp.core.model.entities.Account;
import com.five9group.simpleApp.core.repositories.AccountRepo;

 @Repository
public class JpaAccountRepository implements AccountRepo{
	     
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Account createAccount(Account account) {
		em.persist(account);
        return account;
	}
	
	@Override
	public Account findAccount(Integer id) {
		return em.find(Account.class, id);
	} 
	
	@Override
	public Account deleteAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}
}
