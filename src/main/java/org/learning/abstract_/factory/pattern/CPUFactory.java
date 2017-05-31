package org.learning.abstract_.factory.pattern;

public class CPUFactory extends AbstractFactory {

	@Override
	public RAM getRAMFactory(RAMType ramType) {
		return null;
	}

	@Override
	public CPU getCPUFactory(CPUType cpuType) {
		CPU cpu = null;
		if(cpuType.equals(CPUType.I5)){
			cpu = new Inteli5();
		}
		else if(cpuType.equals(CPUType.I7)){
			cpu = new Inteli7();
		}
		return cpu;
	}


}
