package com.rioc.ws.services.account;

import com.rioc.ws.models.dao.Address;
import com.rioc.ws.models.dto.AddressDto;

public interface IAddressService {

    Address postAddress(AddressDto address);
}
