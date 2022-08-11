package com.example.JUnitTester;

import org.junit.jupiter.api.Test;

import com.example.customers.CustomersApplication;
import com.example.customers.controller.CustomerController;
import com.example.customers.entity.Customer;

public class JUnitTestCase{
@Test
void test() {
	CustomersApplication test = new CustomersApplication();
	CustomerController test1 = new CustomerController();
	
	Customer test2 = new Customer();
	
}

}
