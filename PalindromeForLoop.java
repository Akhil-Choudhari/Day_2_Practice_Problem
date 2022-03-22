package Day2Program;

import java.util.Scanner;

public class PalindromeForLoop {

	public static void main(String[] args) {
		String original, reverse = "";
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println(original+ ": is a palindrome number.");  
	      else  
	         System.out.println(reverse+": is not a palindrome number."); 

	}

}
