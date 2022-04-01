package org.stong.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.stong.model.Customer;

//https://semaphoreci.com/community/tutorials/stubbing-and-mocking-with-mockito-2-and-junit
public class CustomerReader {
	
	@PersistenceContext
	private EntityManager entityManager;

	public String findFullName(Long customerID){
		Customer customer = entityManager.find(Customer.class, customerID);
		return customer.getFirstName() +" "+customer.getLastName();
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}