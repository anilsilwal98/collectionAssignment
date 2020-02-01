package com.collectionService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.collectionProject.Employee;

public class EmployeeService {
	private List<Employee> employee = new ArrayList<>();

	public List<Employee> getEmployee() {
		return employee;
	}
	
	public int addEmployee(Employee emp) {
		boolean check = true;
		for (Employee e : this.getEmployee()) {
			if (e.getId() == emp.getId()) {
				check = false;
			}
	      }
		if (check) {
			this.getEmployee().add(emp);
			return emp.getId();
		}
		return 0;
	}
	
	public void printElement() {
		for (Employee e : this.getEmployee()) {
			System.out.println(e);
		}		
	}
	
	public void addRawEmployee() {
		addEmployee(new Employee(1,20,"Anil","Silwal"));
		addEmployee(new Employee(2,26,"Ashok","Silwal"));
		addEmployee(new Employee(3,24,"Ashish","Prasai"));
		addEmployee(new Employee(4,25,"Rajesh","Bhuju"));
		printElement();
	}

	public void sortEmployeeById() {
		Comparator<Employee> compareById = (Employee o1, Employee o2) -> o1.getAge()-o2.getAge();
		Collections.sort(getEmployee(), compareById);
		printElement();
	}
	public void sortEmployeeByFirstName() {
		Comparator<Employee> compareByFirstName = (Employee o1, Employee o2) -> {
			if(o1.getFirstName().equalsIgnoreCase(o2.getFirstName())) {
				 return o1.getLastName().compareTo( o2.getLastName());
			 } else {
				 return o1.getFirstName().compareTo( o2.getFirstName() );
			 }
		 };
		Collections.sort(getEmployee(), compareByFirstName);
		printElement();
	}
	
	public void sortEmployeeByLastName() {
		Comparator<Employee> compareByLastName = (Employee o1, Employee o2) -> {
			if(o1.getLastName().equalsIgnoreCase(o2.getLastName())) {
				 return o1.getFirstName().compareTo( o2.getFirstName() );
			 } else {
				 return o1.getLastName().compareTo( o2.getLastName());
			 }
		 };	
		Collections.sort(getEmployee(), compareByLastName);
		printElement();
	}
	
	public void sortEmployee(Scanner scan) {
		System.out.println("\nEnter 1 for sort by Age\nEnter 2 for Sort by First Name\nEnter 3 for Sort by Last Name");
		int sorts = scan.nextInt();
		switch(sorts) {
			case 1:
				sortEmployeeById();
				break;
			case 2:
				sortEmployeeByFirstName();
				break;
			case 3:
				sortEmployeeByLastName();
				break;
			case 0: 
				break;
		}
		
	}
}
