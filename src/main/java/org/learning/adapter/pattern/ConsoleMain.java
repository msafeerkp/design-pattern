package org.learning.adapter.pattern;

public class ConsoleMain {
	
	public static void main(String[] args) {
		
		TravelDeskInterface deskInterface = new TravelDeskImpl();
		String status = deskInterface.bookTicket("Bangalore", "Singapore", "EMP000123")?"Success" : "Failure";
		System.out.println("Status of your booking is "+status);
		
	}

}
