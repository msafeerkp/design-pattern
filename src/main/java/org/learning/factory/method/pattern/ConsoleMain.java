package org.learning.factory.method.pattern;

import java.util.Scanner;

/**
 * 
 * @author safeer
 *
 */
public class ConsoleMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose the computer type >>");
		System.out.println("1. Desktop");
		System.out.println("2. Laptop");
		int choice = scanner.nextInt();
		Computer computer = null;
		switch(choice){
			case 1:
				computer = ComputerFactory.getInstance().getComputer(ComputerType.DESKTOP);
				break;
			case 2:
				computer = ComputerFactory.getInstance().getComputer(ComputerType.LAPTOP);
				break;
		}
		System.out.println("The price of computer is >> "+computer.getPrice());
		scanner.close();
		
		
	}
}
