package com.tcs.bank.services;

import com.tcs.bank.models.Person;

public interface PersonService {
	
	Person createPerson(Person person);
	
	Person updatePerson(Long personId,Person person);
	
	Person deletePerson(String documentId);

}
