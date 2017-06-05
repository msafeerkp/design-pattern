package org.learning.singleton.early;

public class SampleService {
	
	private final static SampleService SAMPLE_SERVICE = new SampleService();
	
	private SampleService() {
		// TODO Auto-generated constructor stub
	}
	
	public static SampleService getSampleService(){
		return SAMPLE_SERVICE;
	}
	
	public void doSomething(){
		System.out.println("I am from do something method...");
	}

}
