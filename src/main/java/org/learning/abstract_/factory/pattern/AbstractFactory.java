package org.learning.abstract_.factory.pattern;

/**
 * 
 * @author safeer
 *
 */
public abstract class AbstractFactory {
	
	public abstract RAM getRAMFactory(RAMType ramType);
	
	public abstract CPU getCPUFactory(CPUType cpuType);

	public static AbstractFactory getFactory(FactoryType factoryType){
		AbstractFactory abstractFactory = null;
		switch(factoryType){
			case CPU:
				abstractFactory = new CPUFactory();
				break;
			case RAM:
				abstractFactory = new RAMFactory();
				break;
		}
		return abstractFactory;
	}
}
