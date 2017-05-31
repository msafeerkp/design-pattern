package org.learning.factory.method.pattern;

/**
 * 
 * @author safeer
 *
 */
public class ComputerFactory {
	
	private static ComputerFactory computerFactory = null;
	
	/**
	 * 
	 * @return
	 */
	public static ComputerFactory getInstance(){
		
		if(computerFactory == null){
			computerFactory = new ComputerFactory();
		}
		return computerFactory;
		
	}
	/**
	 * 
	 * @param computerType
	 * @return
	 */
	public Computer getComputer(ComputerType computerType){
		
		Computer computer = null;
		switch(computerType){
			case DESKTOP:
				computer = new Desktop();
				break;
			case LAPTOP:
				computer = new Laptop();
				break;
		}
		return computer;
		
	}

}
