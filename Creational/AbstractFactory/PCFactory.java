package Creational.AbstractFactory;

public class PCFactory implements ComputerAbstractFactory{

    private String ram;
	private String ssd;
	private String cpu;
	
	public PCFactory(String ram, String ssd, String cpu){
		this.ram=ram;
		this.ssd=ssd;
		this.cpu=cpu;
	}
	@Override
	public Computer createComputer() {
		return new PC(ram,ssd,cpu);
	}
    
}
