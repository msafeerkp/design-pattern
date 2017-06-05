package org.learning.adapter.pattern;

public class TravelDeskImpl extends EmployeeService implements TravelDeskInterface{

	@Override
	public boolean bookTicket(String source, String destination, String empId) {
		Employee employee = findById(empId);
		// TODO perform booking by using employee details, source and destination. and return the status
		return true;
	}

}
