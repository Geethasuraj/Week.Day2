package week1.day2assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		// Convert the String to character array
		char[] ch = test.toCharArray();

		// Traverse through each character (using loop)
		for (int i = 0; i < ch.length; i++) {
			
			// find the odd index within the loop (use mod operator)
			if (i % 2 == 0) {
				// within the loop, change the character to uppercase, if the index is odd else
				// don't change
				System.out.println(Character.toLowerCase(ch[i]));
			} else {
				System.out.println(Character.toUpperCase(ch[i]));
			}

		}

	}
}