package com.sandhya.CRM_Web_App.service;

import java.util.List;

import com.sandhya.CRM_Web_App.model.Customer;

public interface ICustomerService {
	public List<Customer>getCustomerInfo();
	public Customer registerCustomer( Customer customer);
	public Customer fetchById(Integer id);
	public void deleteById(Integer id);

}
