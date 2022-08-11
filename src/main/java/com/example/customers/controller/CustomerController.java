package com.example.customers.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customers.entity.Customer;
import com.example.customers.repository.CustomerRepository;



//import com.example.Customer.entity.Customer;
//import com.example.Customer.repository.CustomerRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")

public class CustomerController {

	@Autowired
	private CustomerRepository eRepo;

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return eRepo.findAll(Sort.by(Sort.Direction.ASC,"id"));

	}

	@PostMapping("/customers")
	public Customer saveCustomerDetails(@RequestBody Customer customer) {
		return eRepo.save(customer);
	}
	
	@PutMapping("/customers")
	public Customer updateCustomers(@RequestBody Customer customer) {
		return eRepo.save(customer);
	}

	@GetMapping("/customers/{id}")
	public Customer GetSingleCustomer(@PathVariable Long id) {
		return eRepo.findById(id).get();
		
	}
	@GetMapping("/get")
	public String Get()
	{
		return "Hello Spring boot Docker";
	}
	@DeleteMapping("/customers/{id}")
	public ResponseEntity<HttpStatus> DeleteEmployeeById(@PathVariable Long id) {
		eRepo.deleteById(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}

	
}