package com.bridgelabz.testcases;

public class TestMaximum {
	
	public static void maximumInteger(Integer []intArr) {
		
		int maxCheck = intArr[0].compareTo(intArr[1]);
		if(maxCheck>0) {
			maxCheck=intArr[0].compareTo(intArr[2]);
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[0]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
			
		}else if(maxCheck<0) {
			maxCheck=intArr[1].compareTo(intArr[2]); 
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[1]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
		}
		
	}
	
	public static void maximumDouble(Double []intArr) {
		
		int maxCheck = intArr[0].compareTo(intArr[1]);
		if(maxCheck>0) {
			maxCheck=intArr[0].compareTo(intArr[2]);
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[0]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
			
		}else if(maxCheck<0) {
			maxCheck=intArr[1].compareTo(intArr[2]); 
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[1]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
		}
	}
	
	public static void main(String[] args) {
		
		Integer intArray[] = {20,22,21};
		Double doubleArray[] = {29.26,22.25,28.23};//TC-1.1 :- max num at first position.
		maximumInteger(intArray);
		maximumDouble(doubleArray);
		Double doubleArray1[]= {12.1, 25.8, 17.7}; //TC-1.2 :- max num at second position.
		maximumDouble(doubleArray1);
		Double doubleArray2[]= {15.3, 15.8, 20.56}; //TC-1.3 :- max num at third position.
		maximumDouble(doubleArray2);
	}
}