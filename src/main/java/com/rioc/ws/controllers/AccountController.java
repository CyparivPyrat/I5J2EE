package com.rioc.ws.controllers;

import com.rioc.ws.models.dto.AccountDto;
import org.springframework.web.bind.annotation.*;

import com.rioc.ws.models.dao.Account;
import com.rioc.ws.services.account.IAccountService;

import javax.validation.Valid;

@RestController
public class AccountController {
	private IAccountService service;

	public AccountController(IAccountService service) {
		this.service = service;
	}

	@PostMapping("/accounts")
	public Account postAccount(@Valid @RequestBody AccountDto account){
		return service.postAccount(account);
	}

	@GetMapping("/accounts")
	public Account getAccount(@RequestParam int id){
		return service.getAccountById(id);
	}

	@DeleteMapping("/accounts")
	public void deleteAccount(@RequestParam int id){
		service.deleteAccountById(id);
	}

}
