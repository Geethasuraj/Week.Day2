package week1.day2assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		//Arrange the array in ascending order
		Arrays.sort(data);
		//Pick the 2nd element from the last and print it
		System.out.println("Second Largest Number is:" + data[data.length-2]);

	}

}
