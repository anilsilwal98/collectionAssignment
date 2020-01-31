package com.employeeService;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.collectionProject.Person;
import java.lang.Math;
import java.math.BigDecimal; 
public class PersonService {
	
	private List<Person> person = new ArrayList<>();

	public List<Person> getPerson() {
		return person;
	}

	public void addPerson(Person person) {
		getPerson().add(person);
	}

	public List<Person> generateList(){
		person.add(new Person(1,"Ankur", 200000f));
		person.add(new Person(1,"Anil", 190000f));
		person.add(new Person(1,"Rajesh", 150000f));
		person.add(new Person(1,"Ashish", 160000f));
		person.add(new Person(1,"Gopal", 180000f));
		return this.person;
	}
	public void setPerson(List<Person> person){
		this.person = person;
	}

	public Map<Float, Person> transform(List<Person> p){
		Map<Float, Person> transformed = new HashMap<>();
		for(int i = 0;i<p.size();i++) {
			float id = p.get(i).getId();
			int j = 0;
			while(transformed.containsKey(id)) {
				j = j+ 1;
				double x = Math.pow(10,-(j));
				id = id + (float)x;  
			}
			transformed.put(id,p.get(i));									
		}
		return transformed;
	}
	
	public void show(List<Person> p) {
		for(int i = 0;i<p.size();i++) {
			System.out.println(p.get(i));
		}
	 }
	public void show(Map<Float,Person> mapPerson) {
		mapPerson.forEach((k,v)->System.out.println("Mapped Person Key : " + k + ", Value : " + v));		
		System.out.println("\n");
	}
		
}
