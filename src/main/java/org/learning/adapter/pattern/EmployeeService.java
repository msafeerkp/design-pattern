package org.learning.adapter.pattern;

public class EmployeeService {
	
	public Employee findById(String id){
		// retruning a sample record;
		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setName("User");
		return employee;
	}

}
