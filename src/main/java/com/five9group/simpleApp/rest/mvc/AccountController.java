package com.five9group.simpleApp.rest.mvc;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.five9group.simpleApp.core.model.entities.Account;
import com.five9group.simpleApp.core.service.AccountService;
import com.five9group.simpleApp.core.service.exception.AccountExistException;
import com.five9group.simpleApp.rest.resource.AccountResource;
import com.five9group.simpleApp.rest.resource.asm.AccountResourceAsm;
import com.five9group.simpleApp.rest.resource.exception.BadRequestException;

@Controller
@RequestMapping("/rest/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<AccountResource> createAccount(@RequestBody AccountResource accountData){
		try{
			Account account = accountService.addAccount(accountData.toAccount());
			AccountResource accountResource =new AccountResourceAsm(AccountController.class, AccountResource.class).toResource(account);
			HttpHeaders headers = new HttpHeaders();
			//headers.setLocation(URI.create(accountResource.getLink("self").getHref()));
			return new ResponseEntity<AccountResource>(accountResource, HttpStatus.OK);
		}
		catch (AccountExistException exception) {
		throw new BadRequestException(exception);
		}
		
	}
	
}
