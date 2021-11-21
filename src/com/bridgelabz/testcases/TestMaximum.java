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
				System.out.println("maximum of three doubles is : " + intArr[0]);
			}
			else
				System.out.println("maximum of three doubles is : " + intArr[2]);
			
		}else if(maxCheck<0) {
			maxCheck=intArr[1].compareTo(intArr[2]); 
			if(maxCheck>0) {
				System.out.println("maximum of three doubles is : " + intArr[1]);
			}
			else
				System.out.println("maximum of three doubles is : " + intArr[2]);
		}
	}
	
	private static void maximumSting(String[] stringArray) {
		int maxCheck = stringArray[0].compareTo(stringArray[1]);
		if(maxCheck>0) {
			maxCheck=stringArray[0].compareTo(stringArray[2]);
			if(maxCheck>0) {
				System.out.println("maximum of three strings is : " + stringArray[0]);
			}
			else
				System.out.println("maximum of three strings is : " + stringArray[2]);
			
		}else if(maxCheck<0) {
			maxCheck=stringArray[1].compareTo(stringArray[2]); 
			if(maxCheck>0) {
				System.out.println("maximum of three strings is : " + stringArray[1]);
			}
			else
				System.out.println("maximum of three strings is : " + stringArray[2]);
		}	
	}
	
	public static void main(String[] args) {
		
		Integer intArray[] = {20,22,21};
		Double doubleArray[] = {26.26,22.25,28.23};
		
		maximumInteger(intArray);
		maximumDouble(doubleArray);
		
		/** Test cases for Strings. **/
		String stringArray[]={"Peach", "Apple", "Banana"};  //TC-1.1 :- max string at first position.
		String stringArray1[]={"car", "cycle", "bike"};  //TC-1.2 :- max string at second position.
		String stringArray2[]={"bat", "ball", "wickets"}; //TC-1.3 :- max string at third position. 
		maximumSting(stringArray);
		maximumSting(stringArray1);
		maximumSting(stringArray2);
	
	}
}