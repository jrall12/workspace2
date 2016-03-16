package com.five9group.simpleApp.rest.resource.asm;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import com.five9group.simpleApp.core.model.entities.Account;
import com.five9group.simpleApp.rest.mvc.AccountController;
import com.five9group.simpleApp.rest.resource.AccountResource;

public class AccountResourceAsm extends ResourceAssemblerSupport<Account,AccountResource>{

	public AccountResourceAsm(Class<AccountController> accountController, Class<AccountResource> resourceType) {
		super(accountController, resourceType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountResource toResource(Account account) {
		AccountResource accountResource = new AccountResource();
		accountResource.setUserId(account.getUserId());
		accountResource.setEmailAddress(account.getEmailAddress());
//		Link link = linkTo(methodOn(AccountController.class).getAccountById(account.getId())).withSelfRel();	
//		accountResource.add(link);
		return accountResource;
	}

}
