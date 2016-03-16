package com.five9group.simpleApp.rest.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
//import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.five9group.simpleApp.core.model.entities.Account;
import com.five9group.simpleApp.core.service.AccountService;

public class AccountControllerTest {

	@InjectMocks
	private AccountController controller;

	@Mock
	private AccountService service;

	private MockMvc mockMvc;

	private ArgumentCaptor<Account> accountCaptor;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

		accountCaptor = ArgumentCaptor.forClass(Account.class);
	}

	@Test
	public void testAccountController() throws Exception {
		Account createdAccount = new Account();
		createdAccount.setEmailAddress("thapab@five9group.com");
		createdAccount.setUserId("thapab");
		createdAccount.setId(1);
		when(service.addAccount(any(Account.class))).thenReturn(createdAccount);
		mockMvc.perform(post("/rest/accounts").content("{\"emailAddress\":\"thapab@five9group.com\",\"userId\":\"test\"}")
				.contentType(MediaType.APPLICATION_JSON))
				//.andExpect(header().string("Location", org.hamcrest.Matchers.endsWith("/rest/accounts/1")))
				//.andExpect(jsonPath("$.emailAddress",is(createdAccount.getEmailAddress())))
		        .andExpect(status().isOk());
		verify(service).addAccount(accountCaptor.capture());
		String email = accountCaptor.getValue().getEmailAddress();
		assertEquals("thapab@five9group.com", email);

	}

}
