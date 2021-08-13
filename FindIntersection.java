package week1.day2assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare An array for {3,2,11,4,6,7};
		int arr[] = {3,2,11,4,6,7};
		
		// Declare another array for {1,2,8,4,9,7};
		int arr1[] = {1,2,8,4,9,7};
		
		//Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr.length; i++) {
			
			//Declare a nested for another array from 0 to array length
			for (int j = 0; j < arr1.length; j++) {
				
				//Compare Both the arrays using a condition statement
				if ( arr[i] == arr1[j]) {
					System.out.println("Matched arrays are:" + arr[i]);
				}
				
			}
		}
			

	}

}
