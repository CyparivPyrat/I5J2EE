package com.rioc.ws.services.account;

import com.rioc.ws.models.dao.Account;
import com.rioc.ws.models.dto.AccountDto;

public interface IAccountService {
	public Account postAccount(AccountDto account);

    public Account getAccountById(int id);
    public void deleteAccountById(int id);
}
