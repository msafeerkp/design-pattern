package org.learning.prototype;

import java.util.Scanner;

public class ConsoleMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Company Details >>");
		System.out.println("name >>");
		String name = scanner.nextLine();
		System.out.println("location >>");
		String location = scanner.nextLine();
		
		Company company1 = new Company(name, location);
		company1.displayData();
		
		System.out.println("Creating a new Comany Object ....");
		Company company2 = (Company)company1.clone();
		company2.displayData();
		scanner.close();
		
	}

}
