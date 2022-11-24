package com.rioc.ws.models.dao;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ACCOUNT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Account implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "ACCOUNT_ID", unique = true, nullable = false)
	private int accountId;
	
	@Column( name = "FIRST_NAME")
	private String firstName;
	
	@Column( name = "LAST_NAME")
	private String lastName;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID")
	private Address address;


	public Account() {
		// TODO Auto-generated constructor stub
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	

}
