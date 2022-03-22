package Day2Program;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner arit= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = arit.nextInt();
		System.out.println("Enter the Second number");
		int b = arit.nextInt();
		System.out.println("Enter the third number");
		int c = arit.nextInt();
		float p = a + b * c;
		float q = c + a / b;
		float r = a % b + c;
		float s = a * b + c;
		System.out.print(p+ ",");
		System.out.print(q+ ",");
		System.out.print(r+ ",");
		System.out.println(s);
		if ( p >= q && p >= r && p >= s ) {
			System.out.println("maximun value is: " +p);
		}
		else if ( q >= p && q >= r && q >= s ) {
			System.out.println("maximum value is :" +q);
		}
		else if ( r >= p && r >= q && r >= s ) {
			System.out.println("maximum value is: " +r);
		}
		else if ( s >= p && s >= q && s >= r ) {
			System.out.println("maximum value is :" +s);
				
		}		
		if ( p <= q && p <= r && p <= s ) {
			System.out.println("minimum value is: " +p);
		}
		else if ( q <= p && q <= r && q <= s ) {
			System.out.println("minimum value is :" +q);
		}
		else if ( r <= p && r <= q && r <= s ) {
			System.out.println("minimum value is: " +r);
		}
		else if ( s <= p && s <= q && s <= r ) {
			System.out.println("minimum value is :" +s);
		}			
		else
					System.out.println("some values are equal");
				
				
			
		}
	}


