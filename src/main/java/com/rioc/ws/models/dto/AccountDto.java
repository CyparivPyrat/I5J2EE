package com.rioc.ws.models.dto;

import com.rioc.ws.models.dao.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class AccountDto {
    @NotNull
    private String firstName;
    private String lastName;
    private AddressDto address;
}
