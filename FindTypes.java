package week1.day2assignment;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// a) Convert the String to character array
		char ch[] = test.toCharArray();
		// Traverse through each character (using loop)
		for (int i = 0; i < ch.length; i++) {
			// Find if the given character is what type using (if)
			// Character.isLetter
			
			 if (Character.isLetter(ch[i])) {
				letter = letter + 1;
			}
			// Character.isDigit
			else if (Character.isDigit(ch[i])) {
				num = num + 1;
			}			
			
			// Character.isSpaceChar
			else if (Character.isSpaceChar(ch[i])) {
				space = space + 1;
			}
			// else -> consider as special character
			else {
				specialChar = specialChar + 1;
			}
		}

		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}
}
