package com.collectionProject;

public class Person {
	private int id;
	private String name;
	private Float salary;

	public Person(int id, String name, Float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Float getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
