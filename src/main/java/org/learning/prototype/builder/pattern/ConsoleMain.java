package org.learning.prototype.builder.pattern;

import java.util.Scanner;

public class ConsoleMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employe details >>");
		System.out.println("Enter name >>");
		String name = scanner.nextLine();
		System.out.println("Enter id >>");
		String id = scanner.nextLine();
		System.out.println("Address >>");
		String address = scanner.nextLine();
		System.out.println("buisiness unit >>");
		String bu = scanner.nextLine();
		
		Employee employee =new Employee.EmployeeBuilder(name, id).setAddress(address).setBusinessUnit(bu).build();
		System.out.println("Employee Details are ");
		System.out.println("name >>"+employee.getName());
		System.out.println("id >>"+employee.getEmployeeId());
		System.out.println("address >>"+employee.getAddress());
		System.out.println("bu >>"+employee.getBusinessUnit());
		scanner.close();
	}

}
