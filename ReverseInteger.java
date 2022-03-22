package Day2Program;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		int num;
		int reverse = 0;
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		while(num !=0) {
			int digit = num % 10;
		reverse = reverse * 10 + digit;
		num /= 10;
		}
		System.out.println("The reverse of the number is :" +reverse);
		

	}

}
