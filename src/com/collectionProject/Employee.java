package com.collectionProject;

public class Employee {
	private int id;
	private int age;	
	private String firstName;
	private String lastName;
	
	public Employee(int id, int age, String firstName, String lastName) {
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return this.id;
	}
	public int getAge() {
		return this.age;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	@Override
	public String toString() {
		return "Id: " + getId() + ", Age: " + getAge() + ", FirstName: " + getFirstName() + ", LastName: " + getLastName();		
	}
}
