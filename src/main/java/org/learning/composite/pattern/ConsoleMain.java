package org.learning.composite.pattern;

public class ConsoleMain {
	
	public static void main(String[] args) {
		
		Employee manager = new Manager("manager1","EMP1");
		Employee developer1 = new Developer("dev1","EMP2");
		Employee developer2 = new Developer("dev2","EMP3");
		manager.add(developer1);
		manager.add(developer2);
		
		System.out.println("Empoyee "+manager.get(0).getName()+" reporting to "+manager.getName());
	}

}