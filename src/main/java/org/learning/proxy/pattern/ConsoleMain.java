package org.learning.proxy.pattern;

public class ConsoleMain {
	
	public static void main(String[] args) {
		
		DataBaseManager baseManager = new DatabaseProxyManager();
		baseManager.getDBObject("EMP123");
		
	}

}
