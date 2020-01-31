package com.employeeService;

import java.util.List;
import java.util.Scanner;

public class ReadFromUserService {

	public boolean checkRange(int c) {
		if (c>0 && c<6) {
			return true;
		}
		return false;
	}
	
	public Object readFromUser(Scanner scan) {
		if(scan.hasNextBoolean()) {
			boolean val = scan.nextBoolean();
			return val;
		}
		else if(scan.hasNextInt()){
			int val = scan.nextInt();						
			return val;
		}
		else if(scan.hasNextFloat()){
			float val = scan.nextFloat();			
			return val;
		}
		else if(scan.hasNextDouble()){
			double val = scan.nextDouble();	
			return val;
		}
		else if(scan.hasNext()){
			String val  = scan.next();
			if(val.length()==1) {
				char v = val.charAt(0);
				return v;
			}else {
				return val;
			}
		}
		else {
			System.out.println("\nNull values or duplicates are not allowed");
			return null;
		}
	}

	public List changedOne(Object readFromUser, int index, List elements) {
		
		if (readFromUser instanceof Boolean) {
			Boolean value = (Boolean) readFromUser;
			elements.set(index,(Boolean)!value);
		}
		else if(readFromUser instanceof Character) {
			int value = (Character) readFromUser;
			System.out.println("Before:"+(char)value );
			if ((65 <= value && value < 90) || (97 <= value && value <122)) {
				value += 1;					
			}
			else if(value == 90){
				value = 65;
			}
			else if(value == 122){
				value = 97;
			}			
			System.out.println("After:"+(char)value);
			System.out.println("\nEnter 1-5 index range to replace the value in the given list\n");
			elements.set(index,(char)value);
		}
		
		else if(readFromUser instanceof String) {
			String value = (String) readFromUser;
			if(value.equals(value.toUpperCase())) {
				elements.set(index,(String)value.toLowerCase());
			}
			else{
				elements.set(index,(String)value.toUpperCase());
			}
		}
		
		else if(readFromUser instanceof Float) {
			Float value = (Float)readFromUser;
			value = (float) (value +  2.0);
			elements.set(index,value);			
		}
		
		else if(readFromUser instanceof Double ) {
			Double value = (Double)readFromUser;
			value = (double) (value +  2.0);
			elements.set(index,value);			
		}
		
		else if(elements.get(index) instanceof Integer) {
			Integer value = (Integer)readFromUser;
			value += 1;
			elements.set(index,value);			
		}
		return elements;
	}
	
	public void printElements(List elements) {
		System.out.println("Elements in the list\n");
		for(int i =0 ; i<elements.size();i++) {
			System.out.println("Index "+ i+ " : " + elements.get(i));
		}
	}
	
	public void modifyElement(Scanner scan, List elements) {
		this.printElements(elements);
		System.out.println("\nEnter the element you want to insert");
		Object readFromUser = this.readFromUser(scan);
		while(!readFromUser.equals('#')) {
			System.out.println("\nEnter 1-5 index range to replace the value in the given list\n");
			int index = scan.nextInt();
			try {
				if(this.checkRange(index)) {
					elements =  this.changedOne(readFromUser,index, elements);
					this.printElements(elements);
				}
				else {
					System.out.println("Only values between 1-5 are allowed, please try again.");				
				}
			}catch(Exception e) {
				System.out.println("Only number values between 1-5 are allowed, please try again.");				
			}			
			System.out.println("\nEnter the element you want to insert");
			readFromUser = this.readFromUser(scan);
		}
		System.out.println("Exiting from the Question 1\n");
	}
	
}

