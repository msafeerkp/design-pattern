package org.learning.prototype.builder.pattern;

public class Employee {
	
	private String name;
	private String employeeId;
	private String businessUnit;
	private String address;
	
	private Employee(EmployeeBuilder builder) {
		
		this.name = builder.name;
		this.employeeId = builder.employeeId;
		this.businessUnit = builder.businessUnit;
		this.address = builder.address;
	}
	
	public String getName() {
		return name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public String getAddress() {
		return address;
	}
	
	public static class EmployeeBuilder{
		
		private String name;
		private String employeeId;
		private String businessUnit;
		private String address;
		
		public EmployeeBuilder(String name, String employeeId) {
			this.name = name;
			this.employeeId = employeeId;
		}
		
		public EmployeeBuilder setBusinessUnit(String businessUnit) {
			this.businessUnit = businessUnit;
			return this;
		}
		public EmployeeBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Employee build(){
			return new Employee(this);
		}
		
		
	}
	

}
