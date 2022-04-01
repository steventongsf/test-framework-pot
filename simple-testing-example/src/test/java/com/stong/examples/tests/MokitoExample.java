package com.stong.examples.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.stong.junit.JUnitGroup;
import org.stong.model.Customer;
import org.stong.repository.CustomerReader;

//@ExtendWith(MockitoExtension.class)
public class MokitoExample {

	@Test
	@Tag(JUnitGroup.UNIT)
	@Tag(JUnitGroup.FAST)
	public void dependencyInjection(){
		Customer sampleCustomer = new Customer();
		sampleCustomer.setFirstName("Steven");
		sampleCustomer.setLastName("Tong");
	
		EntityManager entityManager = mock(EntityManager.class);
		when(entityManager.find(Customer.class,1L)).thenReturn(sampleCustomer);
	
		CustomerReader customerReader = new CustomerReader();
		customerReader.setEntityManager(entityManager);
	
		String fullName = customerReader.findFullName(1L);
		assertEquals("Steven Tong",fullName);
	}
}