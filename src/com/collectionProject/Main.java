package com.collectionProject;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.employeeService.EmployeeService;
import com.employeeService.PersonService;

public class Main {		
	public static void main(String[] args) {
			System.out.println("Enter 1 for question1\nEnter 2 for question2\nEnter 3 for question3\nEnter 4 for question4\nEnter 0 to exit\n");
			Scanner scan = new Scanner(System.in);
			int c = scan.nextInt();
			while(c != 0) {
				switch(c) {
					case 1:
						ListObject ob = new ListObject();
						List elements =  Arrays.asList("One",2,"ABC",67.986,'Z',true,123,false,"xyz");
						ob.modifyElement(scan,elements);
						break;
					case 2:
						EmployeeService eservice = new EmployeeService();
						eservice.addRawEmployee();
						eservice.sortEmployee(scan);
						System.out.println("\n");
						break;
					case 4:
						PersonService pservice = new PersonService();
						pservice.show(pservice.transform(pservice.generateList()));
						pservice.show(pservice.getPerson());
						System.out.println("\n");
					case 0:
						break;
					}
				System.out.println("Enter 1 for question1\nEnter 2 for question2\nEnter 3 for question3\nEnter 4 for question4\nEnter 0 to exit\n");
				scan = new Scanner(System.in);
				c = scan.nextInt();
			}
			System.out.println("Exiting from the System\n");
		}
}
