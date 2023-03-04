package org.scannertest;

import java.util.Scanner;

public class Employeedetails {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		Scanner S1 = new Scanner(System.in);

		System.out.println("Emp ID");
		int ID = S.nextInt();

		System.out.println("Employee phone number");
		int P = S.nextInt();

		System.out.println("Salary per month");
		float A = S.nextFloat();
		
		System.out.println("Employee Gender");
		char G = S.next().charAt(2);
		
		System.out.println("Employee city");
		String C = S.nextLine();

		System.out.println("Employee details");
		System.out.println("============");
	   System.out.println("Emp ID "+ID);
	   System.out.println("Employee phone number "+P);
	   System.out.println("Salary per month "+A);
	   System.out.println("Employee Gender "+G);
	   System.out.println("Employee city "+C);
	}

	
}
