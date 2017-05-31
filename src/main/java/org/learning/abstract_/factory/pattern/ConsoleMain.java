package org.learning.abstract_.factory.pattern;

import java.util.Scanner;

/**
 * 
 * @author safeer
 *
 */
public class ConsoleMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose the component type >>");
		System.out.println("1. CPU");
		System.out.println("2. RAM");
		int choice = scanner.nextInt();
		switch(choice){
			case 1:
				System.out.println("Please choose the type >>");
				System.out.println("1. i5");
				System.out.println("2. i7");
				choice = scanner.nextInt();
				if(choice == 1){
					String cpuType = AbstractFactory.getFactory(FactoryType.CPU).getCPUFactory(CPUType.I5).getCPUType();
					System.out.println("Your selection is >> "+cpuType);
				}
				else if(choice == 2){
					String cpuType = AbstractFactory.getFactory(FactoryType.CPU).getCPUFactory(CPUType.I7).getCPUType();
					System.out.println("Your selection is >> "+cpuType);
				}
				break;
			case 2:
				System.out.println("Please choose the type >>");
				System.out.println("1. DDR2 SDRAM");
				System.out.println("2. DDR3 SDRAM");
				choice = scanner.nextInt();
				if(choice == 1){
					String ramType = AbstractFactory.getFactory(FactoryType.RAM).getRAMFactory(RAMType.DDR2).getRAMType();
					System.out.println("Your selection is >> "+ramType);
				}
				else if(choice == 2){
					String ramType = AbstractFactory.getFactory(FactoryType.RAM).getRAMFactory(RAMType.DDR3).getRAMType();
					System.out.println("Your selection is >> "+ramType);
				}
				break;
		}
		scanner.close();
		
		
	}
}
