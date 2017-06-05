package org.learning.prototype;

public class Company implements Cloneable{
	
	private String name;
	private String location;
	
	public Company(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public void displayData(){
		System.out.println("===== Company details ===========");
		System.out.println(" Name :: "+this.name);
		System.out.println("Location :: "+this.location);
		System.out.println("=================================");
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Company(this.name, this.location);
	}
	

}
