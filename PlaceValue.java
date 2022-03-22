package Day2Program;

import java.util.Scanner;

public class PlaceValue {

	public static void main(String[] args) {
	Scanner value= new Scanner(System.in);
	System.out.print("Enter the 1 or multiple of 10");
	int a = value.nextInt();
	if (a == 1)
	System.out.println("The place value of entered number is : UNIT");
	else if (a == 10)
	System.out.println("The place value of entered number is :TEN");
	else if (a == 100)
		System.out.println("The place value of entered number is : HUNDRED");
	else if (a == 1000)
		System.out.println("The place value of entered number is : THOUSAND");
	else if (a == 10000)
		System.out.println("The place value of entered number is : TEN THOUSAND");
	else if (a == 100000)
		System.out.println("The place value of entered number is : LAKH");
	else if (a == 1000000)
		System.out.println("The place value of entered number is : TEN LAKHS");
	else if (a == 10000000)
		System.out.println("The place value of entered number is : CRORES");
	else if (a == 100000000)
		System.out.println("The place value of entered number is : TEN CRORES");
	else 
		System.out.println("Entered number is too big");

	}

}
