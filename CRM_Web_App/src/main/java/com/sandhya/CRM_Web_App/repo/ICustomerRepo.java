package com.sandhya.CRM_Web_App.repo;

import org.springframework.data.repository.CrudRepository;

import com.sandhya.CRM_Web_App.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer,Integer>{

}
