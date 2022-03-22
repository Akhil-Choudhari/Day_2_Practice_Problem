package Day2Program;

import java.util.Scanner;

public class SumForLoop {

	public static void main(String[] args) {
		  int x, i = 1 ;
	        int sum = 0;
	        System.out.println("Enter the Number");
	        Scanner sc = new Scanner(System.in);
	        x = sc.nextInt();
for(i=1; i<=x; ++i)
{
	sum = sum + i;
	
}
System.out.println("Sum of "+x+"(Natural  numbers) is: "+sum);
}

}
