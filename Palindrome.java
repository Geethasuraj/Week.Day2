package week1.day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Declare A String value as"madam"
		
		String str = "madam";
		
		//Declare another String rev value as "
		
		String rev = "";
		
		int strLength = str.length();
		
		//Iterate over the String in reverse order
		for(int i =  (strLength-1); i>=0;--i)
			
			//add the char into rev
			rev = rev + str.charAt(i);
			// Compare the original String with the reversed String, if it is same then print palinDrome 
			 if(str.equals(rev))
				 System.out.println(str+ " is a palindrome");
			 else
				 System.out.println(str+ "is not a palindrome");
		
	}

}
