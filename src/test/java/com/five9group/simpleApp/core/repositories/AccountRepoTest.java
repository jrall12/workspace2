package com.five9group.simpleApp.core.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.five9group.simpleApp.core.model.entities.Account;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:TestDataSourceConfiguration.xml")
public class AccountRepoTest {
	
	@Autowired
	private AccountRepo accountRepo;
	
	private Account account;
	
@Before	
@Test
@Transactional
@Rollback(false)
public void testCreateAccount(){
	
	account = new Account();
	account.setEmailAddress("thapab@five9group.com");
	account.setUserId("thapab");
	account = accountRepo.createAccount(account);
	assertNotNull(account.getEmailAddress());
	assertNotNull(account.getUserId());
}
@Test
public void testFindAccountById(){
	assertNotNull(accountRepo.findAccount(1));
	
}
	

}
