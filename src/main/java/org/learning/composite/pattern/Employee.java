package org.learning.composite.pattern;

public interface Employee {
	
	public String getName();
	
	public String getEmployeeId();
	
	public String getBusinessUnit();
	
	public String getAddress();
	
	// Composite behavior
	public void add(Employee employee);
	
	public void remove(Employee employee);
	
	public Employee get(int position);

	
}
