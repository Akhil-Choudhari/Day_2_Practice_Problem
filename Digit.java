package Day2Program;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner digit= new Scanner(System.in);
	System.out.print("Enter the single digit number");
	int a = digit.nextInt();
	if (a == 0)
	System.out.println("The entered digit is: ZERO");
	else if (a == 1)
	System.out.println("The entered digit is: ONE");
	else if (a == 2)
		System.out.println("The entered digit is : TWO");
	else if (a == 3)
		System.out.println("The entered digit is : THREE");
	else if (a == 4)
		System.out.println("The entered digit is : FOUR");
	else if (a == 5)
		System.out.println("The entered digit is : FIVE");
	else if (a == 6)
		System.out.println("The entered digit is : SIX");
	else if (a == 7)
		System.out.println("The entered digit is : SEVEN");
	else if (a == 8)
		System.out.println("The entered digit is : EIGTH");
	else if (a == 9)
		System.out.println("The entered digit is : NINE");
	
	else 
		System.out.println("Not entered a single digit number");
	}

}
