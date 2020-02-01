package com.collectionServiceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.collectionProject.Person;
import com.collectionService.PersonService;

class PersonServiceTest {

	private PersonService pservice;
	
	@BeforeEach
	public void setup() {
		pservice = new PersonService();
	}
	
	@Test
	public void testAssertAddPersonSucessCase() {
		int id = pservice.addPerson(new Person(1,"Ankur", 200000f));
		assertEquals(1,id);			
	}

	
	@Test
	public void testAssertSetPersonListSucessCase() {
		pservice.setPerson(pservice.generateList());
		assertEquals(pservice.getPerson(),pservice.generateList());
	}


}
