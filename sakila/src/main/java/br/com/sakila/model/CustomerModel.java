package br.com.sakila.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer",schema = "sakila")

public class CustomerModel implements Serializable {
	 private static final long serialversionUID = 1L;
	 @Id
	 @Column(name = "customer_id")
	 private Integer customerId;
	 @Column(name = "first_name")
	 private String firstName;
	 @Column(name = "last_name")
	 private String lastName;
	 @Column(name = "email")
	 private String email;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	}
	
	