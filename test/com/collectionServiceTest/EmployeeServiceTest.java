package com.collectionServiceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.collectionProject.Employee;
import com.collectionService.EmployeeService;

class EmployeeServiceTest {

	private EmployeeService employeeService;
	
	@BeforeEach
	public void setup() {
		employeeService = new EmployeeService();
	}
	
	@Test
	public void testAssertAddEmployeeSucessCase() {
		int id = employeeService.addEmployee(new Employee(1,20,"Anil","Silwal"));
		assertEquals(1,id);
	}
	
	@Test
	public void testAddRawEmployeeSucessCase() {
		employeeService.addRawEmployee();
	}
	
	@Test
	public void testSorEmployeeById() {
		employeeService.addRawEmployee();
		employeeService.sortEmployeeById();
	}
	
	@Test
	public void testSorEmployeeByFirstName() {
		employeeService.addRawEmployee();
		employeeService.sortEmployeeByFirstName();
	}
	
	@Test
	public void testSorEmployeeByLastName() {
		employeeService.addRawEmployee();
		employeeService.sortEmployeeByLastName();
	}
}
