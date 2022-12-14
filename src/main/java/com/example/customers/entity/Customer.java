package com.example.customers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_customers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	
	
	
	@Column(name = "phone")
	private String phone;
	
	
public Long getId() {
	return id;
}
public void setId(Long id) {
	 this.id=id;
}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
		;

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		;

	}

}
