package week1.day2;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Getting input from the user
		@SuppressWarnings("resource")
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the range of Fibanacci Series:");
		int n = scan1.nextInt();
		//Initialising the prefixed value
		int a1 = 0;
		int a2 = 1;
		System.out.println(a1+"");
		System.out.println(a2+"");
		
		//Initialising the loop to run i=2 to lesser than number
		for (int i = 2; i<n;i++) {
			int a3 = a1+a2;
			System.out.println(a3+"");
			a1=a2;
			a2=a3;
			
		}

	}

}
