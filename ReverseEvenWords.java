package week1.day2assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		// split the words and have it in an array
		String[] arr = test.split(" ");

		// b) Traverse through each word (using loop)
		for (int i = 0; i < arr.length; i++) {
			// find the odd index within the loop (use mod operator)
			if (i % 2 != 0) {
				// split the words and have it in an array
				String test1 = arr[i];
				String[] arr1 = test1.split("");
				// print the even position words in reverse order using another loop (nested
				// loop)
				for (int j = arr1.length - 1; j >= 0; j--) {
					// Convert words to character array if the position is even else print the word
					// as it is(concatenate space at the end).
					System.out.print(arr1[j]);
				}
			}

			else {
				System.out.print(" " + arr[i] + " ");
			}

		}

	}
}
