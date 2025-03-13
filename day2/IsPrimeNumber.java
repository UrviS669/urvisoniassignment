package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number:");
		int number = scan.nextInt();
		
		int count = 0;
		
		for(int i=1; i<=number; i++) {
			if(number%1 == 0) {
				count++;
				
				
			}
		}
	
if (count == 2) {
	System.out.println("The given number "+number+ "is a prime number");
	
}
else {
	System.out.println("The given number"+number+"is not a prime number");;
}
	}

}
