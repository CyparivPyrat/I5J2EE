package com.rioc.ws.services.account;

import com.rioc.ws.exceptions.ApiException;
import com.rioc.ws.mappers.IAccountMapper;
import com.rioc.ws.models.dto.AccountDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.rioc.ws.models.dao.Account;
import com.rioc.ws.repositories.IAccountRepository;

import java.util.Optional;


@Service
public class AccountService implements IAccountService {

	private IAccountRepository repository;
	private IAccountMapper mapper;
	public AccountService(IAccountRepository repository, IAccountMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}
	
	public Account postAccount(AccountDto account) {
		if(!repository.findByFirstNameAndLastName(account.getFirstName(), account.getLastName()).isEmpty()){
			throw new ApiException("user dejà existant", HttpStatus.CONFLICT);
		}
		return repository.save(mapper.accountDtoToAccount(account));
	}

	public Account getAccountById(int id){
		Optional <Account> optionalAccount = repository.findById(id);
		if(optionalAccount.isEmpty()){
			return null;
		}
		return optionalAccount.get();
	}
	public void deleteAccountById(int id){
		if(repository.findById(id).isEmpty()){
			throw new ApiException("id non existant", HttpStatus.CONFLICT);
		}

		repository.deleteById(id);
	}
}
