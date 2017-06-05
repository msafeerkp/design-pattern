package org.learning.singleton.lazy;

public class SampleService {
	
	private static SampleService sampleService;
	
	private SampleService() {
		// TODO Auto-generated constructor stub
	}
	
	public static SampleService getSampleService(){
		if(sampleService == null){
			synchronized (SampleService.class) {
				if(sampleService == null){
					sampleService = new SampleService();
				}
			}
		}
		return sampleService;
	}
	
	public void doSomething(){
		System.out.println("I am from do something method...");
	}

}
