package Creational.AbstractFactory;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
	private String ssd;
	private String cpu;
	
	public ServerFactory(String ram, String ssd, String cpu){
		this.ram=ram;
		this.ssd=ssd;
		this.cpu=cpu;
	}
	@Override
	public Computer createComputer() {
		return new Server(ram,ssd,cpu);
	}
}
