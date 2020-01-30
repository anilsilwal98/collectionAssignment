package com.collectionProject;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListObject {
	public boolean checkRange(int c) {
		if (c>0 && c<6) {
			return true;
		}
		return false;
	}
	public List changedOne(int index, List elements) {
		
		if (elements.get(index) instanceof Boolean) {
			Boolean value = (Boolean) elements.get(index);
			elements.set(index,(Boolean)!value);
		}
		
		else if(elements.get(index) instanceof Character) {
			int value = (Character) elements.get(index);
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
		
		else if(elements.get(index) instanceof String) {
			String value = (String) elements.get(index);
			if(value.equals(value.toUpperCase())) {
				elements.set(index,(String)value.toLowerCase());
			}
			else{
				elements.set(index,(String)value.toUpperCase());
			}
		}
		
		else if(elements.get(index) instanceof Float) {
			Float value = (Float) elements.get(index);
			value = (float) (value +  2.0);
			elements.set(index,value);			
		}
		
		else if(elements.get(index) instanceof Double ) {
			Double value = (Double) elements.get(index);
			value = (double) (value +  2.0);
			elements.set(index,value);			
		}
		
		else if(elements.get(index) instanceof Integer) {
			Integer value = (Integer) elements.get(index);
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
		System.out.println("\nEnter 1-5 index range to replace the value in the given list\n");
		String readFromUser = scan.next();
		while(!readFromUser.equalsIgnoreCase("#")) {
			try {
				int parsedValue = Integer.parseInt(readFromUser);
				if(this.checkRange(parsedValue)) {
					elements =  this.changedOne(parsedValue, elements);
					this.printElements(elements);
				}
				else {
					System.out.println("Only values between 1-5 are allowed, please try again.");				
				}
			}catch(Exception e) {
				System.out.println("Only number values between 1-5 are allowed, please try again.");				
			}			
			System.out.println("\nEnter 1-5 index range to replace the value in the given list\n");
			readFromUser = scan.next();
		}
		System.out.println("Exiting from the Question 1\n");
	}
	
}
