package org.learning.abstract_.factory.pattern;

public class RAMFactory extends AbstractFactory {

	@Override
	public RAM getRAMFactory(RAMType ramType) {
		RAM ram = null;
		if(ramType.equals(RAMType.DDR2)){
			ram = new DDR2SDRAM();
		}
		else if(ramType.equals(RAMType.DDR3)){
			ram = new DDR3SDRAM();
		}
		return ram;
	}

	@Override
	public CPU getCPUFactory(CPUType cpuType) {
		return null;
	}


}
