package week1.day2assignment;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";
		char searchChar = 'e';

		// declare and initialize a variable count to store the number of occurrences

		int count = 0;
		// convert the string into char array
		 char[] arr = str.toCharArray();
		// get the length of the array

		
	
		// traverse from 0 till the array length
		for (int i = 0; i < arr.length; i++) {
			//// Check the char array has the particular char in it
			if (arr[i] == searchChar) {
				count = count +1;
			}

			// if is has increment the count
			

		}
		// print the count out of the loop

		
		System.out.println(count);

	}
}
