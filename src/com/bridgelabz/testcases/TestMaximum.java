package com.bridgelabz.testcases;

public class TestMaximum {

	public static <T extends Comparable<T>> void maximum(T[] arr) {

		int maxCheck = arr[0].compareTo(arr[1]);
		if (maxCheck > 0) {
			maxCheck = arr[0].compareTo(arr[2]);
			if (maxCheck > 0) {
				System.out.println("maximum of three values is : " + arr[0]);
			} else
				System.out.println("maximum of three values is : " + arr[2]);

		} else if (maxCheck < 0) {
			maxCheck = arr[1].compareTo(arr[2]);
			if (maxCheck > 0) {
				System.out.println("maximum of three values is : " + arr[1]);
			} else
				System.out.println("maximum of three values is : " + arr[2]);
		}
	}
	
	public static void main(String[] args) {
		
		Integer intArray[] = {20,22,21};
		Double doubleArray[] = {26.26,22.25,28.23};
		
		maximum(intArray);
		maximum(doubleArray);
		
		/** Test cases for Strings. **/
		String stringArray[]={"Peach", "Apple", "Banana"};  //TC-1.1 :- max string at first position.
		String stringArray1[]={"car", "cycle", "bike"};  //TC-1.2 :- max string at second position.
		String stringArray2[]={"bat", "ball", "wickets"}; //TC-1.3 :- max string at third position. 
		maximum(stringArray);
		maximum(stringArray1);
		maximum(stringArray2);
	
	}
}