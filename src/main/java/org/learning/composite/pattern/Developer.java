package org.learning.composite.pattern;

/**
 * Leaf Node.
 * @author safeer
 *
 */
public class Developer implements Employee{
	
	private String name;
	private String employeeId;
	private String businessUnit;
	private String address;
	
	public Developer(String name,String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	@Override
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public void add(Employee employee) {
		
		
	}
	@Override
	public void remove(Employee employee) {
		
	}
	@Override
	public Employee get(int position) {
		return null;
	}
	
	

}
