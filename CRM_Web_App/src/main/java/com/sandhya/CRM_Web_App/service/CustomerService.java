package com.sandhya.CRM_Web_App.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandhya.CRM_Web_App.model.Customer;
import com.sandhya.CRM_Web_App.repo.ICustomerRepo;
@Service
public class CustomerService implements ICustomerService {
	@Autowired
	private ICustomerRepo repo;
	@Override
	public List<Customer> getCustomerInfo() {
		// TODO Auto-generated method stub
		return (List<Customer>) repo.findAll();
	}

	@Override
	public Customer registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public Customer fetchById(Integer id) {
		Optional<Customer> optional = repo.findById(id);
		return optional.get();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
