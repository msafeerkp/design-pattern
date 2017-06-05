package org.learning.proxy.pattern;

public class DatabaseProxyManager implements DataBaseManager{

	@Override
	public Object getDBObject(String empId) {
		// TODO Auto-generated method stub
		Object object = null;
		if(isAllowed(empId) == false){
			System.out.println("You are not allowed");
			return null;
		}
		return object;
	}
	
	private boolean isAllowed(String empId){
		//check the permission
		return false;
	}

}
