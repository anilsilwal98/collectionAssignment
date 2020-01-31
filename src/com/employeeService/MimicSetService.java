package com.employeeService;

import java.util.Scanner;

import com.collectionProject.MimicSetUsingArray;

public class MimicSetService {

	public void addElement(Scanner scan, MimicSetUsingArray arr) {
		if(scan.hasNextBoolean()) {
			boolean val = scan.nextBoolean();
			arr.add(val);
		}
		else if(scan.hasNextInt()){
			int val = scan.nextInt();						
			arr.add(val);
		}
		else if(scan.hasNextFloat()){
			float val = scan.nextFloat();			
			arr.add(val);
		}
		else if(scan.hasNextDouble()){
			double val = scan.nextDouble();	
			arr.add(val);	
		}
		else if(scan.hasNext()){
			String val  = scan.next();
			if(val.length()==1) {
				char v = val.charAt(0);
				arr.add(v);	
			}else {
				arr.add(val);					
			}
		}
		else {
			System.out.println("\nNull values or duplicates are not allowed");			
		}
	}
	
	public void removeElement(Scanner scan, MimicSetUsingArray arr) {
		if(scan.hasNextBoolean()) {
			boolean val = scan.nextBoolean();
			arr.remove(val);
		}
		else if(scan.hasNextInt()){
			int val = scan.nextInt();						
			arr.remove(val);
		}
		else if(scan.hasNextFloat()){
			float val = scan.nextFloat();			
			arr.remove(val);
		}
		else if(scan.hasNextDouble()){
			double val = scan.nextDouble();	
			arr.remove(val);	
		}
		else if(scan.hasNext()){
			String val  = scan.next();
			if(val.length()==1) {
				char v = val.charAt(0);
				arr.remove(v);	
			}else {
				arr.remove(val);					
			}
		}
		else {
			System.out.println("\nNo Element Found to remove");			
		}
	}

	public void mimicSet(Scanner scan,MimicSetUsingArray arr) {
		System.out.println("Size Of Array Now: "+arr.size());			
		System.out.println("\nEnter 1 to Add element\nEnter 2 to Remove Element\nEnter 0 to exit");
		int option = scan.nextInt();
		while(option != 0) {
			switch(option) {
				case 1:
					System.out.println("\nEnter value to Add to  the MimicSetUsingArray");
					addElement(scan, arr);
					arr.showAll();
					break;
				case 2:
					System.out.println("\nEnter value to Remove from the MimicSetUsingArray");
					removeElement(scan, arr);
					arr.showAll();
					break;
				default: 
					break;
			}
			System.out.println("\nSize Of Array Now: "+arr.size());			
			System.out.println("\nEnter 1 to add element\nEnter 2 to remove element\nEnter 0 to exit");
			option = scan.nextInt();
		}
	}
}


