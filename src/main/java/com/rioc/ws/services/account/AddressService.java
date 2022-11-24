package com.rioc.ws.services.account;

import com.rioc.ws.exceptions.ApiException;
import com.rioc.ws.mappers.IAccountMapper;
import com.rioc.ws.mappers.IAddressMapper;
import com.rioc.ws.models.dao.Account;
import com.rioc.ws.models.dao.Address;
import com.rioc.ws.models.dto.AccountDto;
import com.rioc.ws.models.dto.AddressDto;
import com.rioc.ws.repositories.IAccountRepository;
import com.rioc.ws.repositories.IAddressRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAddressService{
    public AddressService() {
    }

    public AddressService(IAddressRepository repository, IAddressMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    private IAddressRepository repository;
    private IAddressMapper mapper;

    public Address postAddress(AddressDto address) {

        return repository.save(mapper.addressDtoToAddress(address));
    }
}
