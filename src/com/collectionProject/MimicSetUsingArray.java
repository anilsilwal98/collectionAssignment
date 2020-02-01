package com.collectionProject;
import java.lang.reflect.Array;
import java.util.List;

public class MimicSetUsingArray  {
	private int length = 4;

  // create a new array of size n+1 
    Object arr[] = new Object[length]; 

    public int size() {
		return Array.getLength(arr);
	}
	public boolean inArray(Object E) {
		for(int i =0;i<this.size();i++) {
			if (this.arr[i] !=null && this.arr[i].equals(E)) {
				return true;
			}
		}
		return false;
	}
	public boolean checkIfNeedtoExtend() {
		boolean checkIfFilled = true;
		for(int i =0;i<this.size();i++) {
			if (this.arr[i] == null) {
				checkIfFilled = false;
			}
		}
		if(checkIfFilled) {
			int newLength = this.length + (this.length/ 2);
			Object[] newArray = new Object[newLength];
			System.arraycopy(arr, 0, newArray, 0, length);
			length = newLength;
			arr = newArray;
			return true;
		}
		return false;
	}
	public void shiftData(int j, Object E) {		
		for(int i = j;i<this.size()-1;i++) {
				this.arr[i] = this.arr[i+1];	
		}
		this.arr[this.size()-1] = null;
	}
	
	public int add(Object E) {
		if(checkIfNeedtoExtend()) {
			System.out.println("Expanded Size of Array by extra half: ");			
		}
		for(int i =0;i<this.size();i++) {
			if (this.arr[i] == null && !inArray(E)) {
				this.arr[i] = E;
				return i;
			}
		}
		return -1;		
	}
	public Object get(int index) {
		for(int i =0;i<this.size();i++) {
			if (i == index) {
				return arr[i];
			}
		}
		return null;
	}
	
	public void remove(Object E) {
		boolean ifRemoved = false;
		for(int i =0;i<this.size();i++) {
			if (this.arr[i]!=null && this.arr[i].equals(E)) {
				shiftData(i,E);
				ifRemoved = true;
				break;
			}
		}
		if(!ifRemoved) {
			System.out.println("\nElement "+ E +": Not Found\n");
		}
	}
	
	public void showAll() {		
	    for(int i =0;i<this.size();i++) {
			System.out.println("Index: "+ i+" ,Value: "+ get(i));
			if(get(i)==null) {
				break;
			}
		}
	}

}
